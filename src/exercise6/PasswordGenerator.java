package exercise6;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte numbers = Byte.parseByte(scanner.nextLine());

        byte letters = Byte.parseByte(scanner.nextLine());

        for (int p0 = 1; p0 < numbers; p0++) {

            for (int p1 = 1; p1 < numbers; p1++) {

                for (int p2 = 1; p2 <= letters; p2++) {

                    for (int p3 = 1; p3 <= letters; p3++) {

                        int bigger = p1;

                        if (p0 > p1) {
                            bigger = p0;
                        }

                        for (int p4 = bigger + 1; p4 <= numbers; p4++) {

                            char position2 = getCharByPosition(p2);

                            char position3 = getCharByPosition(p3);

                            System.out.printf("%d%d%s%s%d ", p0, p1, position2, position3, p4);
                        }
                    }
                }
            }
        }
    }

    private static char getCharByPosition(int position) {
        char letter = 'a';

        if (position == 1)
            letter = 'a';
        else if (position == 2)
            letter = 'b';
        else if (position == 3)
            letter = 'c';
        else if (position == 4)
            letter = 'd';
        else if (position == 5)
            letter = 'e';
        else if (position == 6)
            letter = 'f';
        else if (position == 7)
            letter = 'g';
        else if (position == 8)
            letter = 'h';
        else if (position == 9)
            letter = 'i';

        return letter;
    }
}
