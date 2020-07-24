package lecture3;

import java.util.Scanner;

public class WorkingHours {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte time = Byte.parseByte(scanner.nextLine());
        String day = scanner.nextLine();

        if (time >= 10 && time <= 18 && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday"))) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
