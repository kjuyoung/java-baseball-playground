package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private Balls com;

    @BeforeEach
    void setUp() {
        com = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void play_3S() {
        assertThat(com.play(new Balls(Arrays.asList(1, 2, 3))).getStrike()).isEqualTo(3);
        assertThat(com.play(new Balls(Arrays.asList(1, 2, 3))).getBall()).isEqualTo(0);
        assertThat(com.play(new Balls(Arrays.asList(1, 2, 3))).isGameOver()).isTrue();
    }

    @Test
    void play_2S() {
        assertThat(com.play(new Balls(Arrays.asList(1, 2, 6))).getStrike()).isEqualTo(2);
        assertThat(com.play(new Balls(Arrays.asList(1, 2, 6))).getBall()).isEqualTo(0);
    }

    @Test
    void play_1S_1B() {
        assertThat(com.play(new Balls(Arrays.asList(1, 3, 6))).getStrike()).isEqualTo(1);
        assertThat(com.play(new Balls(Arrays.asList(1, 3, 6))).getBall()).isEqualTo(1);
    }

    @Test
    void play_nothing() {
        assertThat(com.play(new Balls(Arrays.asList(4, 5, 6))).getStrike()).isEqualTo(0);
        assertThat(com.play(new Balls(Arrays.asList(4, 5, 6))).getBall()).isEqualTo(0);
    }

    @Test
    void strike() {
        assertThat(com.play(new Ball(1, 1))).isEqualTo(BaseballStatus.STRIKE);
    }

    @Test
    void ball() {
        assertThat(com.play(new Ball(1, 2))).isEqualTo(BaseballStatus.BALL);
    }

    @Test
    void nothing() {
        assertThat(com.play(new Ball(1, 4))).isEqualTo(BaseballStatus.NOTHING);
    }
}
