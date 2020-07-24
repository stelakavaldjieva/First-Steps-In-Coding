package lecture2;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());

        if (num1 % 2 == 0) {
            System.out.print("even");
            return;
        }
        System.out.print("odd");

    }

}
