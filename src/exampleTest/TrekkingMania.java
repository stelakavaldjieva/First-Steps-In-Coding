package exampleTest;

import java.util.Scanner;

public class TrekkingMania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short groups = Short.parseShort(scanner.nextLine());

        double sumPeople = 0;

        int mousalaCount = 0;

        int molbaCount = 0;

        int kilimandzharoCount = 0;

        int k2Count = 0;

        int everestCount = 0;

        for (int i = 1; i <= groups; i++) {

            short people = Short.parseShort(scanner.nextLine());

            sumPeople += people;

            if (people <= 5) {

                mousalaCount += people;

            } else if (people <= 12) {

                molbaCount += people;

            } else if (people <= 25) {

                kilimandzharoCount += people;

            } else if (people <= 40) {

                k2Count += people;

            } else {

                everestCount += people;
            }

        }

        double mousalaPecent = (mousalaCount / sumPeople) * 100;

        double molbaPecent = (molbaCount / sumPeople) * 100;

        double kilimandzharoPecent = (kilimandzharoCount / sumPeople) * 100;

        double k2Pecent = (k2Count / sumPeople) * 100;

        double everestPecent = (everestCount / sumPeople) * 100;


        System.out.printf("%.2f%%%n", mousalaPecent);

        System.out.printf("%.2f%%%n", molbaPecent);

        System.out.printf("%.2f%%%n",kilimandzharoPecent);

        System.out.printf("%.2f%%%n", k2Pecent);

        System.out.printf("%.2f%%", everestPecent);
    }
}
