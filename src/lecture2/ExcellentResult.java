package lecture2;

import java.util.Scanner;

public class ExcellentResult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float grade = Float.parseFloat(scanner.nextLine());

        if (grade >= 5) {
            System.out.print("Excellent!");
        }

    }
}