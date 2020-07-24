package lecture1;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());

        int second = Integer.parseInt(scanner.nextLine());

        double resultFirst = first * 2.5;

        double resultSecond = second * 4;

        System.out.println(resultFirst + resultSecond);
    }

}
