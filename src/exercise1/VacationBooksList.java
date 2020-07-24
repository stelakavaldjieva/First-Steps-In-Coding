package exercise1;

import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short bookPages = Short.parseShort(scanner.nextLine());

        short pagesPerHour = Short.parseShort(scanner.nextLine());

        short days = Short.parseShort(scanner.nextLine());

        System.out.println((bookPages/pagesPerHour)/days);
    }
}
