package chapter2;
import java.util.Scanner ;
public class ComparingIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter one integer:");

        int userInput = input.nextInt();
        int userInputSquare = userInput * userInput;

        System.out.println(userInputSquare);

        if(userInputSquare == 100) {
            System.out.println("it equals to");
        }
        if(userInputSquare != 100) {
            System.out.println("it !equals to");
        }
        if(userInputSquare > 100) {
            System.out.println("it is greather than");
        }
        if(userInputSquare < 100) {
            System.out.println("it is less than");
        }





    }
}
