package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final List<Ball> answers;

    public Balls(List<Integer> ballNo) {
        this.answers = mapBall(ballNo);
    }

    private List<Ball> mapBall(List<Integer> ballNo) {
        List<Ball> balls = new ArrayList<>();
        for(int i = 0; i < ballNo.size(); i++) {
            balls.add(new Ball(i+1, ballNo.get(i)));
        }
        return balls;
    }

    public PlayResult play(Balls userBall) {
        return mapPlayResult(userBall);
    }

    private PlayResult mapPlayResult(Balls userBall) {
        PlayResult result = new PlayResult();
        for(Ball answer : answers) {
            result.matchBall(userBall.play(answer));
        }
        return result;
    }

    public BaseballStatus play(Ball user) {
        return answers.stream()
                .map(com -> com.play(user))
                .filter(BaseballStatus::isNotNothing)
                .findFirst()
                .orElse(BaseballStatus.NOTHING);
    }
}
