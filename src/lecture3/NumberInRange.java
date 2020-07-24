package lecture3;

import java.util.Scanner;

public class NumberInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte number = Byte.parseByte(scanner.nextLine());

        if (number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
