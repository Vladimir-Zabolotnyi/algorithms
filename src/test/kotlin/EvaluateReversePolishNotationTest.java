import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void evalRPN() {
        EvaluateReversePolishNotation eval = new EvaluateReversePolishNotation();
        String[] array = {"4","13","5","/","+"};
        int result = eval.evalRPN(array);
        System.out.println(result);
    }
}