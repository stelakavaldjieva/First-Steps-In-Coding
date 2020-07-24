package exercise5;

import java.util.Scanner;

public class Cake {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int width = Integer.parseInt(scanner.nextLine());

        int totalPieces = length * width;

        String command = scanner.nextLine();

        while (!"STOP".equals(command)) {

            int currentCakePieces = Integer.parseInt(command);

            totalPieces -= currentCakePieces;

            if (totalPieces < 0) {
                break;
            }
            command = scanner.nextLine();
        }

        if (totalPieces > 0) {
            System.out.printf("%d pieces are left.", totalPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        }
    }
}
