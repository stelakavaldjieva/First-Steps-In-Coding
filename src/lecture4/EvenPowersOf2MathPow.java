package lecture4;

import java.util.Scanner;

public class EvenPowersOf2MathPow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int powerOf2 = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= powerOf2; i += 1) {
            if (i % 2 == 0) {
                System.out.println((int) Math.pow(2, i));
            }
        }
    }
}
