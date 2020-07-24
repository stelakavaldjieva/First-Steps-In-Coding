package lecture3;

import java.util.Scanner;

public class TradeCommissions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double result = 0;

        if (sales >= 0 && sales <= 500) {
            if (city.equals("Sofia"))
                result = 0.05 * sales;
            else if (city.equals("Varna"))
                result = 0.045 * sales;
            else if (city.equals("Plovdiv"))
                result = 0.055 * sales;
        } else if (sales > 500 && sales <= 1000) {
            if (city.equals("Sofia"))
                result = 0.07 * sales;
            else if (city.equals("Varna"))
                result = 0.075 * sales;
            else if (city.equals("Plovdiv"))
                result = 0.08 * sales;
        } else if (sales > 1000 && sales <= 10000) {
            if (city.equals("Sofia"))
                result = 0.08 * sales;
            else if (city.equals("Varna"))
                result = 0.1 * sales;
            else if (city.equals("Plovdiv"))
                result = 0.12 * sales;
        } else if (sales > 10000) {
            if (city.equals("Sofia"))
                result = 0.12 * sales;
            else if (city.equals("Varna"))
                result = 0.13 * sales;
            else if (city.equals("Plovdiv"))
                result = 0.145 * sales;
        }

        if (result == 0)
            System.out.println("error");
        else
            System.out.printf("%.2f", result);
    }
}