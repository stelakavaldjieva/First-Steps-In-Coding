package lecture3;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte dayNumber = Byte.parseByte(scanner.nextLine());

        if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Error");
        }
    }
}
