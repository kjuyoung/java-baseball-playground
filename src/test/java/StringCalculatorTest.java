import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator cal = new StringCalculator();

    @Test
    void plus() {
        assertThat(4).isEqualTo(cal.plus(2, 2));
    }

    @Test
    void minus() {
        assertThat(4).isEqualTo(cal.minus(6, 2));
    }

    @Test
    void multi() {
        assertThat(4).isEqualTo(cal.multi(1, 4));
    }

    @Test
    void divide() {
        assertThat(4).isEqualTo(cal.divide(8, 2));
    }
}