package lecture2;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2) {
            System.out.print(num1);
        } else {
            System.out.print(num2);
        }

    }

}
