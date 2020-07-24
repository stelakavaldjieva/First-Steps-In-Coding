package exercise2;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte hour = Byte.parseByte(scanner.nextLine());
        byte minutes = Byte.parseByte(scanner.nextLine());

        minutes = (byte) (minutes + 15);

        if (minutes > 59) {
            hour = (byte) (hour + 1);
        }
        minutes = (byte) (minutes % 60);
        hour = (byte) (hour % 24);

       System.out.printf("%d:", hour);
       if (minutes<=9){
           System.out.printf("0%d", minutes);
       }else {
           System.out.printf("%d", minutes);
       }
    }
}
