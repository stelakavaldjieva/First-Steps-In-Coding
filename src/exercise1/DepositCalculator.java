package exercise1;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());

        int months = Integer.parseInt(scanner.nextLine());

        double interest = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", deposit + (months * ((deposit * interest*0.01) / 12)));
    }
}
