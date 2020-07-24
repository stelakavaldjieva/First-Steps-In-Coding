package lecture2;

import java.util.Scanner;

public class Number100_200 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short number = Short.parseShort(scanner.nextLine());

        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }
    }
}