package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball com;

    @BeforeEach
    void setUp() {
        this.com = new Ball(1, 2);
    }

    @Test
    void strike() {
        assertThat(com.play(new Ball(1, 2))).isEqualTo(BaseballStatus.STRIKE);
    }

    @Test
    void ball() {
        assertThat(com.play(new Ball(2, 2))).isEqualTo(BaseballStatus.BALL);
    }

    @Test
    void nothing() {
        assertThat(com.play(new Ball(1, 3))).isEqualTo(BaseballStatus.NOTHING);
    }
}
