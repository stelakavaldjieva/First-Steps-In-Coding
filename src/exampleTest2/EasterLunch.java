package exampleTest2;

import java.util.Scanner;

public class EasterLunch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte bread = Byte.parseByte(scanner.nextLine());

        byte eggs = Byte.parseByte(scanner.nextLine());

        byte cruassans = Byte.parseByte(scanner.nextLine());

        double price = bread * 3.20 + eggs * 4.35 + cruassans * 5.40 + eggs * 12 * 0.15;

        System.out.printf("%.2f", price);
    }
}
