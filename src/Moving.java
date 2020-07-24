import java.util.Scanner;

public class Moving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short width = Short.parseShort(scanner.nextLine());

        short length = Short.parseShort(scanner.nextLine());

        short height = Short.parseShort(scanner.nextLine());

        int volume = width * length * height;

        int sumBoxes = 0;

        String command = scanner.nextLine();

        while (!"Done".equals(command)) {

            short boxes = Short.parseShort(command);

            sumBoxes += boxes;

            if (sumBoxes >= volume) {

                System.out.printf("No more free space! You need %d Cubic meters more.", sumBoxes - volume);

                return;
            }
            command = scanner.nextLine();
        }

        System.out.printf("%d Cubic meters left.", volume - sumBoxes);

    }
}
