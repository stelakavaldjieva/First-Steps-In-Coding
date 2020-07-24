package exampleTest2;

import java.util.Scanner;

public class EasterEggs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte paintedEggs = Byte.parseByte(scanner.nextLine());

        int sumRed = 0, sumOrange = 0, sumBlue = 0, sumGreen = 0;

        int maxEggs = Integer.MIN_VALUE;

        for (int i = 1; i <= paintedEggs; i++) {

            String color = scanner.nextLine();

            switch (color) {

                case "red":

                    sumRed++;
                    break;

                case "orange":

                    sumOrange++;
                    break;
                case "blue":

                    sumBlue++;
                    break;

                case "green":

                    sumGreen++;
            }
            if (sumRed > maxEggs) {

                maxEggs = sumRed;

            } else if (sumOrange > maxEggs) {

                maxEggs = sumOrange;

            } else if (sumBlue > maxEggs) {

                maxEggs = sumBlue;

            } else if (sumGreen > maxEggs) {

                maxEggs = sumGreen;
            }
        }

        System.out.printf("Red eggs: %d%n", sumRed);
        System.out.printf("Orange eggs: %d%n", sumOrange);
        System.out.printf("Blue eggs: %d%n", sumBlue);
        System.out.printf("Green eggs: %d%n", sumGreen);

        if (maxEggs == sumRed)
            System.out.printf("Max eggs: %d -> red", maxEggs);

        else if (maxEggs == sumOrange)
            System.out.printf("Max eggs: %d -> orange", maxEggs);

        else if (maxEggs == sumBlue)
            System.out.printf("Max eggs: %d -> blue", maxEggs);

        else if (maxEggs == sumGreen)
            System.out.printf("Max eggs: %d -> green", maxEggs);


    }
}
