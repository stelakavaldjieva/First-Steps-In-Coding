package exercise1;

import java.util.Scanner;

public class FruitMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double costStrawberry = Double.parseDouble(scanner.nextLine());
        double weightBanana = Double.parseDouble(scanner.nextLine());
        double weightOrange = Double.parseDouble(scanner.nextLine());
        double weightRaspberry = Double.parseDouble(scanner.nextLine());
        double weightStrawberry = Double.parseDouble(scanner.nextLine());

        double costRaspberry = 0.5 * costStrawberry;
        double costOrange = 0.6 * costRaspberry;
        double costBanana = 0.2 * costRaspberry;

        double priceAll = (weightRaspberry * costRaspberry) + (weightOrange * costOrange) + (weightBanana * costBanana) + (weightStrawberry * costStrawberry);

        System.out.printf("%.2f", priceAll);
    }
}
