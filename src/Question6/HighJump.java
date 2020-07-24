package Question6;

import java.util.Scanner;

public class HighJump {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int heightGoal = Integer.parseInt(scanner.nextLine());

        int heightStick = heightGoal - 30;

        int jumps = 0;

        while (heightStick <= heightGoal) {

            int fails = 0;

            for (int i = 0; i < 3; i++) {

                int heightJump = Integer.parseInt(scanner.nextLine());

                jumps++;

                if (heightJump > heightStick) {

                    break;

                } else {

                    fails++;

                    if (fails == 3) {
                        System.out.printf("Tihomir failed at %dcm after %d jumps.", heightStick, jumps);
                        return;
                    }
                }
            }

            heightStick += 5;
        }

        System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", heightGoal, jumps);
    }
}
