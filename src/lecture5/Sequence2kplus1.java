package lecture5;

import java.util.Scanner;

public class Sequence2kplus1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int element = 1;

        while (element <= number) {

            System.out.println(element);

            element += element +1;
        }
    }
}
