package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class validBallTest {

    @Test
    void validBall() {
        assertThat(validBall.valid(9)).isTrue();
        assertThat(validBall.valid(1)).isTrue();
        assertThat(validBall.valid(0)).isFalse();
        assertThat(validBall.valid(10)).isFalse();
    }
}
