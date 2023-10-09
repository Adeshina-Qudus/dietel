package classwork;
import java.util.Scanner;
public class SquareOfANumber {
    public static void main(String[] args){

         Scanner input = new Scanner(System.in);

         System.out.println("Enter a number :");

         int userInput = input.nextInt();

         int userinput1 = userInput * userInput;

         System.out.printf("The square of  %d%s%d%n" , userInput , " is "  , userinput1 );

    }
}
