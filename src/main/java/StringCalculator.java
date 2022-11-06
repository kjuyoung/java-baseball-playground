import java.util.Scanner;

public class StringCalculator {

    int execute() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        // split
        String[] values = value.split(" ");

        // calculate string
        int result = toInt(values[0]);
        for(int i = 1; i < values.length; i+=2) {
            result = Calculator(result, values[i], toInt(values[i+1]));
        }

        return result;
    }

    static int toInt(String str) {
        return Integer.parseInt(str);
    }

    int plus(int num1, int num2) {
        return num1 + num2;
    }

    int minus(int num1, int num2) {
        return num1 - num2;
    }

    int multi(int num1, int num2) {
        return num1 * num2;
    }

    int divide(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            System.out.println("Can't divide by 0");
        }
        return 0;
    }

    int Calculator(int num1, String op, int num2) {

        switch (op) {
            case "+":
                return plus(num1, num2);
            case "-":
                return minus(num1, num2);
            case "*":
                return multi(num1, num2);
            case "/":
                return divide(num1, num2);
            default:
                System.out.println("Can't support operator");
                break;
        }
        return -1;
    }
}
