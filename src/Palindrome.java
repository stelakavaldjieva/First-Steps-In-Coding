import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int p0 = 0, p1 = 0, p2 = 0, p3 = 0;

        for (int i = 1; i <= number; i++) {

            p0 = i % 10;

            if (i < 10) {
                System.out.printf("%d ", i);
            }

            if (i >= 10) {
                p1 = (i - p0) / 10 % 10;

                if (i<100 && p0 == p1){
                    System.out.printf("%d ", i);
                }
            }

            if (i >= 100) {
                p2 = (i - p0 - (p1 * 10)) / 100 % 10;

                if (i<1000 && p0==p2){
                    System.out.printf("%d ", i);
                }
            }

            if (i >= 1000) {
                p3 = (i - p0 - (p1 * 10) - (p2 * 100)) / 1000;

                if (p3==p0 && p1==p2){
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
