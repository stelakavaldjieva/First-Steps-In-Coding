package exercise3;

import java.util.Scanner;

public class OperationsBetweenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());

        int n2 = Integer.parseInt(scanner.nextLine());

        String symbol = scanner.nextLine();

        float result = 0;
        String evenness = "";

        if ("+".equals(symbol)) {
            result = n1 + n2;
            if ((result) % 2 == 0)
                evenness = "even";
            else
                evenness = "odd";
            System.out.printf("%d + %d = %.0f - %s", n1, n2, result, evenness);

        } else if ("-".equals(symbol)) {
            result = n1 - n2;
            if ((result) % 2 == 0)
                evenness = "even";
            else
                evenness = "odd";
            System.out.printf("%d - %d = %d - %s", n1, n2, result, evenness);

        } else if ("*".equals(symbol)) {
            result = n1 * n2;
            if ((result) % 2 == 0)
                evenness = "even";
            else
                evenness = "odd";
            System.out.printf("%d * %d = %d - %s", n1, n2, result, evenness);
        }

        if ("/".equals(symbol) ) {
            result = n1 / n2;
            System.out.printf("%d / %d = %.2f", n1, n2, result);
        }else if ( n2 == 0)  {
            System.out.printf("Cannot divide %d by zero", n1);
        }

        if ("%".equals(symbol) ) {
            result = n1 % n2;
            System.out.printf("%d % %d = %d", n1, n2, result);
        }else if ( n2 == 0){
            System.out.printf("Cannot divide %d by zero", n1);
        }
    }
}
