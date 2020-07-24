package lecture5;

import java.util.Scanner;

public class ReadText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();

            if ("Stop".equals(text)) {
                break;
            }
            System.out.printf("%s%n", text);
        }
    }
}
