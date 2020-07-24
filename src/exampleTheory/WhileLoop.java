package exampleTheory;

public class WhileLoop {

    public static void main(String[] args) {

        // 1. How man times will it print "SoftUni:?-6
        //int i = 0;

        //while (i <= 5) {

            System.out.println("SoftUni");

            //i++;
        //}

        // 2. infinity loop.
       // int i = 0;

        //while (i == 0) {

           // System.out.println("SoftUni");

           // if (i == 1)
              //  break;
        //}

        // 3. How many times? -
        //int i = 0;

       // while(i <= 10) {

          //  i--;

        //}

        // 4. 246
       // int i = 0;

       // while (i < 6) {

           // i++;

           // if (i % 2 == 0)

               // System.out.print(i);

       // }

        //5. 1123
        int i = 0;

        while (i < 4) {

            switch(i) {

                case 1:
                    System.out.print(i);

                case 2:
                    System.out.print(i);

                    break;

                case 3:
                    System.out.print(i);

                    break;

            }

            i++;

        }
    }
}
