package exercise2;

import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double secondsRecord = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double secondsSwimming = meters * secondsPerMeter + Math.floor(meters / 15) * 12.5;

        if (secondsSwimming < secondsRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", secondsSwimming);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", secondsSwimming - secondsRecord);
        }
    }
}