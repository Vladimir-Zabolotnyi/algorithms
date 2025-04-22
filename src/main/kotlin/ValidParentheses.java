import java.util.Stack;

public class ValidParentheses {
    Stack<Character> stack;

    public ValidParentheses() {
        stack = new Stack<>();
    }

    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char token = s.charAt(i);

            if (stack.empty() || token == '{' || token == '[' || token == '(') {
                stack.push(token);
            } else {
                switch (token) {
                    case '}':
                        if (stack.pop() != '{') return false;
                        break;
                    case ']':
                        if (stack.pop() != '[') return false;
                        break;
                    case ')':
                        if (stack.pop() != '(') return false;
                        break;
                }
            }
        }

        return stack.empty();
    }
}
