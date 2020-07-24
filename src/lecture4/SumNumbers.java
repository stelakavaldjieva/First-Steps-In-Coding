package lecture4;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int sumNumbers = 0;

        for (int i = 1; i <= countNumbers; i++) {

            sumNumbers += Integer.parseInt(scanner.nextLine());
        }

        System.out.println(sumNumbers);
    }
}
