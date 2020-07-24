package exercise4;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 0; i < number; i++) {

            double element = Double.parseDouble(scanner.nextLine());

            if (element < 200) {
                p1++;
            } else if (element < 400) {
                p2++;
            } else if (element < 600) {
                p3++;
            } else if (element < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f%%%n",p1/number*100);
        System.out.printf("%.2f%%%n",p2/number*100);
        System.out.printf("%.2f%%%n",p3/number*100);
        System.out.printf("%.2f%%%n",p4/number*100);
        System.out.printf("%.2f%%%n",p5/number*100);
    }
}

