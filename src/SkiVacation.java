import java.util.Scanner;

public class SkiVacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short days = Short.parseShort(scanner.nextLine());

        String roomType = scanner.nextLine();

        String evaluation = scanner.nextLine();

        short nights = (short) (days-1);

        double price =0;

        if (nights < 10) {

            if (roomType.equals("room for one person")) {

                price = nights * 18.00;

            } else if (roomType.equals("apartment")) {

                price = nights * 25.00 * 0.7;

            } else if (roomType.equals("president apartment")) {

                price = nights * 35.00 * 0.9;
            }
        }

        if (nights >= 10 && nights <= 15) {
            if (roomType.equals("room for one person")) {
                price = nights * 18.00;
            } else if (roomType.equals("apartment")) {
                price = nights * 25.00 * 0.65;
            } else if (roomType.equals("president apartment")) {
                price = nights * 35.00 * 0.85;
            }
        }

        if (nights > 15) {
            if (roomType.equals("room for one person")) {
                price = nights * 18.00;
            } else if (roomType.equals("apartment")) {
                price = nights * 25.00 * 0.5;
            } else if (roomType.equals("president apartment")) {
                price = nights * 35.00 * 0.8;
            }
        }

        if (evaluation.equals("positive")) {
            System.out.printf("%.2f", price * 1.25);
        } else if (evaluation.equals("negative")) {
            System.out.printf("%.2f", price * 0.9);
        }



    }
}
