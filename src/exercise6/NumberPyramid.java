package exercise6;

import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int current = 1;

        boolean isBigger = false;

        for (int rows = 0; rows <= n; rows++) {

            for (int colons = 0; colons <= rows; colons++) {

                if (current > n) {
                    isBigger = true;
                    break;
                }

                System.out.print(current + " ");

                current++;
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
