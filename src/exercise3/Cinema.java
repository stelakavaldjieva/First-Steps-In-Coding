package exercise3;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        // брой редове
        byte r = Byte.parseByte(scanner.nextLine());
        //брой колони
        byte c = Byte.parseByte(scanner.nextLine());

        double income = 0.0;

        if (type.equals("Premiere")) {
            income = 12 * r * c;

        }else if (type.equals("Normal")) {
            income =  7.50 * r * c;

        }else if (type.equals("Discount")){
            income = 5 * r * c;
        }
        System.out.printf("%.2f", income);
    }
}
