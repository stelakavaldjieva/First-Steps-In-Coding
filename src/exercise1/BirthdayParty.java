package exercise1;

import java.util.Scanner;

public class BirthdayParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short room = Short.parseShort(scanner.nextLine());

        double cake = room * 0.2;

        double drinks = cake - cake * 0.45;

        double animater = (double) room / 3;

        System.out.println(room + cake + drinks + animater);
    }
}
