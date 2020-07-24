package lecture3;

import java.util.Scanner;

public class WeekendOrWorkingDaySwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//Type a day of the week to find out if it's a Working day or Weekend.
        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
