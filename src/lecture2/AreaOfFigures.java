package lecture2;

import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();

        float area = 0.0f;

        if (shape.equals("square")) {
            float side = Float.parseFloat(scanner.nextLine());
            area = side * side;
        } else if (shape.equals("rectangle")) {
            float sideA = Float.parseFloat(scanner.nextLine());
            float sideB = Float.parseFloat(scanner.nextLine());
            area = sideA * sideB;
        } else if (shape.equals("circle")) {
            float radius = Float.parseFloat(scanner.nextLine());
            area = (float) (Math.PI * radius * radius);
        } else if (shape.equals("triangle")) {
            float base = Float.parseFloat(scanner.nextLine());
            float height = Float.parseFloat(scanner.nextLine());
            area = (base * height) / 2;
        }
        System.out.printf(String.valueOf(area));
    }

}