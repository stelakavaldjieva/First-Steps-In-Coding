package exercise3;

import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short timeExam = 0;

        short timeArrival = 0;

        timeExam += (short) (Byte.parseByte(scanner.nextLine()) * 60);

        timeExam += Byte.parseByte(scanner.nextLine());

        timeArrival += (short) (Byte.parseByte(scanner.nextLine()) * 60);

        timeArrival += Byte.parseByte(scanner.nextLine());

        short result = 0;

        if (timeArrival > timeExam) {

            System.out.println("Late");

            result = (short) (timeArrival - timeExam);

            if (result < 60)

                System.out.printf("%d minutes after the start", result);
            else if (result % 60 < 10)

                System.out.printf("%d:0%d hours after the start", (result - (result % 60)) / 60, result % 60);
            else

                System.out.printf("%d:%d hours after the start", (result - (result % 60)) / 60, result % 60);

        } else {

            result = (short) (timeExam - timeArrival);

            if (result <= 30) {

                System.out.println("On time");

                if (result > 0)
                    System.out.printf("%d minutes before the start", result);

                return;
            }

            System.out.println("Early");

            if (result < 60)

                System.out.printf("%d minutes before the start", result);
            else if (result % 60 < 10)

                System.out.printf("%d:0%d hours before the start", (result - (result % 60)) / 60, result % 60);
            else

                System.out.printf("%d:%d hours before the start", (result - (result % 60)) / 60, result % 60);

        }
    }
}
