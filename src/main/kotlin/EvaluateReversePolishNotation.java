import java.util.Arrays;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    Stack<Integer> stack;

    public EvaluateReversePolishNotation() {
        stack = new Stack<>();
    }

    public int evalRPN(String[] tokens) {
        String[] operators = {"+", "-", "*", "/"};
        for (String token : tokens) {
            if (Arrays.stream(operators).noneMatch(token::equals)) {
                stack.push(Integer.valueOf(token));
            } else {
                int first = stack.pop();
                int second = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(second + first) ;
                        break;
                    case "-":
                        stack.push(second - first) ;
                        break;
                    case "*":
                        stack.push(second * first) ;
                        break;
                    case "/":
                        stack.push(second / first);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
