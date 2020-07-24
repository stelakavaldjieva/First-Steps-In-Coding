package lecture4;

import java.util.Scanner;

public class EvenPowersOf2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int powerOf2 = Integer.parseInt(scanner.nextLine());

        int currentValue = 1;

        System.out.println(currentValue);

        for (int i = 1; i <= powerOf2; i++) {
            currentValue *= 2;

            if (i % 2 == 0)
                System.out.println(currentValue);
        }
    }
}
