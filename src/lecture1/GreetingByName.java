package lecture1;

import java.util.Scanner;

public class GreetingByName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");
    }

}
