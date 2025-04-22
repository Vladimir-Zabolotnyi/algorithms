import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class BasicCalculator {

    public int calculate(String s) {
        int number = 0;
        int result = 0;
        String sign = "+";
        Stack<Integer> stack = new Stack<>();
        String[] operators = {"+", "-", "*", "/"};
        String[] arrayOfTokens = s.replaceAll("\\s+", "").split("(?=[*\\-+/])|(?<=[*\\-+/])");

        for (int i = 0; i < arrayOfTokens.length; i++) {
            String token = arrayOfTokens[i];

            if (Arrays.asList(operators).contains(token)) {
                if (i == arrayOfTokens.length - 1) {
                    switch (sign) {
                        case "+":
                            stack.push(number);
                            break;
                        case "-":
                            stack.push(-number);
                            break;
                        case "*":
                            stack.push(stack.pop() * number);
                            break;
                        case "/":
                            stack.push(stack.pop() / number);
                            break;
                    }
                    sign = token;
                }
            } else number = Integer.parseInt(token);
        }

        while (!stack.isEmpty()) result += stack.pop();

        return result;
    }
}
