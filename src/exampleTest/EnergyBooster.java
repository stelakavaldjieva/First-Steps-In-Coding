package exampleTest;

import java.util.Scanner;

public class EnergyBooster {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();

        String size = scanner.nextLine();

        short orderedSets = Short.parseShort(scanner.nextLine());

        double leva = 0;

        if ("Watermelon".equals(fruit)) {

            if ("small".equals(size)) {

                leva = 56 * 2 * orderedSets;

            } else if ("big".equals(size)) {

                leva = 28.70 * 5 * orderedSets;
            }
        } else if ("Mango".equals(fruit)) {

            if ("small".equals(size)) {

                leva = 36.66 * 2 * orderedSets;

            } else if ("big".equals(size)) {

                leva = 19.60 * 5 * orderedSets;
            }
        } else if ("Pineapple".equals(fruit)) {

            if ("small".equals(size)) {

                leva = 42.10 * 2 * orderedSets;

            } else if ("big".equals(size)) {

                leva = 24.80 * 5 * orderedSets;
            }
        } else if ("Raspberry".equals(fruit)) {

            if ("small".equals(size)) {

                leva = 20 * 2 * orderedSets;

            } else if ("big".equals(size)) {

                leva = 15.20 * 5 * orderedSets;
            }
        }

        if (leva >= 400 && leva <= 1000) {

            leva -= leva * 0.15;

        } else if (leva > 1000) {

            leva -= leva * 0.5;
        }

        System.out.printf("%.2f lv.", leva);
    }
}
