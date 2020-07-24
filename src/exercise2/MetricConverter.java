package exercise2;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float input = Float.parseFloat(scanner.nextLine());
        String inputType = scanner.nextLine();
        String outputType = scanner.nextLine();

        if (inputType.equals("m") && outputType.equals("cm")) {
            input *= 100;
        } else if (inputType.equals("m") && outputType.equals("mm")) {
            input *= 1000;
        } else if (inputType.equals("cm") && outputType.equals("m")) {
            input /= 100;
        } else if (inputType.equals("cm") && outputType.equals("mm")) {
            input *= 10;
        } else if (inputType.equals("mm") && outputType.equals("m")) {
            input /= 1000;
        } else if (inputType.equals("mm") && outputType.equals("cm")) {
            input /= 10;
        }

        System.out.printf("%.3f", input);
    }
}
