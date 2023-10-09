package chapter2;

import java.util.Scanner;
public class Arithmetic {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Enter two integer :");

         int userInput1 = input.nextInt();
         int userInput2 = input.nextInt();

            int userInputSquare1 = userInput1 * userInput1;
            int userInputSquare2 = userInput2 * userInput2;

            System.out.println(userInputSquare1);
            System.out.println(userInputSquare2);

         System.out.println(userInputSquare1 - userInputSquare2);






    }

}
