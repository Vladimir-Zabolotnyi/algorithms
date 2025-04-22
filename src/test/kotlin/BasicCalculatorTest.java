import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    @Test
    void calculate() {
        String input = "1*2+3*4-5*6+7*8-9*10";
        BasicCalculator calculator = new BasicCalculator();
        assertThat(calculator.calculate(input)).isEqualTo(-50);
    }
}