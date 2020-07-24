package exercise5;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        // 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 - lv
        //200, 100, 50, 20, 10, 5, 2, 1  - cents

        int cents = (int) (change * 100);

        int countCoins = 0;

        while (cents > 0) {

            if (cents >= 200) {

                cents -= 200;
                countCoins++;

            } else if (cents >= 100) {

                cents -= 100;
                countCoins++;

            } else if (cents >= 50) {

                cents -= 50;
                countCoins++;

            } else if (cents >= 20) {

                cents -= 20;
                countCoins++;

            } else if (cents >= 10) {

                cents -= 10;
                countCoins++;

            } else if (cents >= 5) {

                cents -= 5;
                countCoins++;

            } else if (cents >= 2) {

                cents -= 2;
                countCoins++;

            } else {

                cents -= 1;
                countCoins++;
            }
        }

        System.out.println(countCoins);
    }
}
