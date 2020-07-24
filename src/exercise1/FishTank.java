package exercise1;

import java.util.Scanner;

public class FishTank {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        short length = Short.parseShort(scanner.nextLine());
        short width = Short.parseShort(scanner.nextLine());
        byte height = Byte.parseByte(scanner.nextLine());
        float percent = Float.parseFloat(scanner.nextLine());

        /**
         * 1 dm = 10 cm <=> 1 dm^3 = 1000 cm^3 = 1 l <=> 1 cm^3 = 0.001 l
         */
        System.out.printf("%.2f", ((length * width * height) * 0.001) * (1 - percent * 0.01));
    }
}


