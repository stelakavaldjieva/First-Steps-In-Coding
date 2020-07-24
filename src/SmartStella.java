import java.util.Scanner;

public class SmartStella {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte age = Byte.parseByte(scanner.nextLine());

        double priceWasher = Double.parseDouble(scanner.nextLine());

        double priceToy = Double.parseDouble(scanner.nextLine());

        int toyCounter = 0;

        double money = 0;

        int moneyCounter = 0;

        double birtDayMoney = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 != 0) {

                toyCounter++;

            } else {

                money += 10;

                birtDayMoney+= money;

                moneyCounter++;
            }
        }

        double totalMoney = (toyCounter * priceToy) + ( birtDayMoney- moneyCounter);

        if (totalMoney >= priceWasher) {

            System.out.printf("Yes! %.2f", totalMoney - priceWasher);
        } else {

            System.out.printf("No! %.2f", priceWasher - totalMoney);
        }
    }
}
