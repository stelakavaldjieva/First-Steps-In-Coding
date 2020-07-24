package exercise6;

import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int p0 = 1; p0 <= 9; p0++) {

            if (number % p0 != 0)
                continue;

            for (int p1 = 1; p1 <= 9; p1++) {

                if (number % p1 != 0)
                    continue;

                for (int p2 = 1; p2 <= 9; p2++) {

                    if (number % p2 != 0)
                        continue;

                    for (int p3 = 1; p3 <= 9; p3++) {

                        if (number % p3 != 0)
                            continue;

                        System.out.printf("%d%d%d%d ", p0, p1, p2, p3);
                    }
                }
            }
        }
    }
}
