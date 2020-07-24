package exampleTheory;

public class ConditionalStatements {

    public static void main(String[] args) {

        // 1. Naming conventions variable - savedMoney
        double savedMoney = 0;
        System.out.println("savedMoney = " + savedMoney);

        // 2. true
        boolean isGreater = (5 + 3) > (3 + 4);
        System.out.println("(5 + 3) > (3 + 4) = " + isGreater);

        // 3. Not correct!
        if ("caseSensitive".equals("CaseSensitive")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Not correct!");
        }

        //4. True
        System.out.println(123456 % 100 == 56);

        // 5. Welcome
        String role = "Administator";
        if (role.equals("Administator")) {
            System.out.println("Welcome");
        } else {
            System.out.println("No permission");
        }
    }
}
