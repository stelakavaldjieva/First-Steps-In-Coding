package exercise1;

import java.util.Scanner;

public class USD2BGN {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double usd = Double.parseDouble(scan.nextLine());

        double bgn = usd * 1.79549f;

        System.out.printf("%.2f", bgn);
    }

}
