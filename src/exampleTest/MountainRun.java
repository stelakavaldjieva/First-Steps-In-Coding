package exampleTest;

import java.util.Scanner;

public class MountainRun {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());

        double distance = Double.parseDouble(scanner.nextLine());

        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double secondsNeeded = Math.floor((distance / 50)) * 30 + secondsPerMeter * distance;

        if (secondsNeeded < record) {

            System.out.printf("Yes! The new record is %.2f seconds.", secondsNeeded);
        } else {

            System.out.printf("No! He was %.2f seconds slower.", secondsNeeded - record);
        }
    }
}
