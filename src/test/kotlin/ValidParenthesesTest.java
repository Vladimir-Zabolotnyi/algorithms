import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
         String input = "({{{{}}}))";

         ValidParentheses validParentheses = new ValidParentheses();
         assertThat(validParentheses.isValid(input)).isEqualTo(false);
    }
}