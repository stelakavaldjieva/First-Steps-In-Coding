package lecture4;

import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;

        int evenSum = 0;

        for (int i = 1; i <= numbers; i++) {

            int element = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0)
                evenSum += element;
            else
                oddSum += element;
        }

        if (evenSum == oddSum)
            System.out.printf("Yes%nSum = %d", evenSum);
        else
            System.out.printf("No%nDiff = %d", Math.abs(evenSum - oddSum));

    }
}
