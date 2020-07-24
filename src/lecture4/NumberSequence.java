package lecture4;

import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;

        int biggest = Integer.MIN_VALUE;

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < smallest) smallest = num;
            if (num > biggest) biggest = num;
        }
        System.out.printf("Max number: %d%n", biggest);
        System.out.printf("Min number: %d", smallest);
    }
}
