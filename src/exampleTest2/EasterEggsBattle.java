package exampleTest2;

import java.util.Scanner;

public class EasterEggsBattle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte eggsSumOne = Byte.parseByte(scanner.nextLine());

        byte eggsSumTwo = Byte.parseByte(scanner.nextLine());

        String command = scanner.nextLine();


        while (!"End of battle".equals(command)) {

            if ("one".equals(command)) {

                eggsSumTwo--;

            } else if ("two".equals(command)) {

                eggsSumOne--;
            }
            if (eggsSumOne <= 0 || eggsSumTwo <= 0) {


                break;

            }
            command = scanner.nextLine();
        }

        if (eggsSumOne <= 0) {

            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSumTwo);

        } else if (eggsSumTwo <= 0) {

            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsSumOne);

        } else {
            System.out.printf("Player one has %d eggs left.%n", eggsSumOne);

            System.out.printf("Player two has %d eggs left.", eggsSumTwo);
        }
    }
}
