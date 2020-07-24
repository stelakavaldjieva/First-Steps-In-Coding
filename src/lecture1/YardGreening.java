package lecture1;

import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float area = Float.parseFloat(scanner.nextLine());

        System.out.printf("The final price is: %.2f lv.%n", area * 7.61 - area * 7.61 * 0.18);

        System.out.printf("The discount is: %.2f lv.", area * 7.61 * 0.18);
    }

}
