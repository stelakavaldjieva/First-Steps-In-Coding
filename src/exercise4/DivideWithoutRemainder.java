package exercise4;

import java.util.Scanner;

public class DivideWithoutRemainder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;


        for (int i = 0; i < numbers; i++) {

            double element = Double.parseDouble(scanner.nextLine());

            if (element % 2==0) {
                p1++;
            }
            if (element % 3==0) {
                p2++;
            }
            if (element % 4 ==0) {
                p3++;
            }
        }
        System.out.printf("%.2f%%%n",p1/numbers*100);
        System.out.printf("%.2f%%%n",p2/numbers*100);
        System.out.printf("%.2f%%%n",p3/numbers*100);

    }
}

