package exercise4;

import javax.swing.*;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte tabs = Byte.parseByte(scanner.nextLine());

        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < tabs; i++) {

            String element = scanner.nextLine();

            if ("Facebook".equals(element)) {
                salary -= 150;
            } else if ("Instagram".equals(element)) {
                salary -= 100;
            } else if ("Reddit".equals(element)) {
                salary -= 50;
            }

            if (salary <= 0) {
                break;
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);
        }
    }
}

