package baseball;

import java.util.Objects;

public class Ball {
    private final int index;
    private final int no;

    public Ball(int index, int no) {
        this.index = index;
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return index == ball.index && no == ball.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, no);
    }

    public BaseballStatus play(Ball userBall) {
        if(this.equals(userBall)) {
            return BaseballStatus.STRIKE;
        }
        if(this.matchBall(userBall)) {
            return BaseballStatus.BALL;
        }
        return BaseballStatus.NOTHING;
    }

    private boolean matchBall(Ball userBall) {
        return this.no == userBall.no;
    }
}
