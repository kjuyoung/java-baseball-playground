package baseball;

public class validBall {

    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;

    public static boolean valid(int ballNo) {
        return MIN_NUM <= ballNo && ballNo <= MAX_NUM;
    }
}
