package exercise2;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte timeFirst = Byte.parseByte(scanner.nextLine());
        byte timeSecond = Byte.parseByte(scanner.nextLine());
        byte timeThird = Byte.parseByte(scanner.nextLine());

        int timeTotal = timeFirst + timeSecond + timeThird;

        int minutes = timeTotal / 60;
        int seconds = timeTotal % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }


    }
}
