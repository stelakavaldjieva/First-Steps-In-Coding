package exampleTheory;

public class ConditionalStatementsAdvanced {

    public static void main(String[] args) {

       // 1. 6
        int a = 5;

        switch (a) {

            case 5:

            case 6:

                a = a + 1;

                break;

            default:

                a = a + 2;

                break;

        }
        System.out.println("a = " + a);

        // 2. false
        System.out.println(!(5 == 5) && (4 + 1 == 5));

        // 3. false
        System.out.println(!(3 == 3) || (3 == 5));

        // 4. true
        System.out.println(!(3 > 5) || (1 == 1));

        // 5. Larger than 1
        //Less than 101
        //Equal to 101
        int number = 101;

        if (number >= 1)

            System.out.println("Larger than 1");

        if (number <= 101)

            System.out.println("Less than 101");

        System.out.println("Equal to 101");

        // 6. No input.
        String role = "Administrator";

        String password = "SoftUni";

        if(role.equals("SoftUni")) {

            if(password.equals("SoftUni")) {

                System.out.println("Welcome!");

            }

        }
    }
}
