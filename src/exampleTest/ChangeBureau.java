package exampleTest;

import java.util.Scanner;

public class ChangeBureau {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte bitcoins = Byte.parseByte(scanner.nextLine());

        double chineseCoins = Double.parseDouble(scanner.nextLine());

        double commission = Double.parseDouble(scanner.nextLine());

        double leva = bitcoins * 1168 + (chineseCoins * 0.15) * 1.76;

        double euro = (leva / 1.95)- (commission/100) * (leva / 1.95);

        System.out.printf("%.2f", euro);


    }
}
