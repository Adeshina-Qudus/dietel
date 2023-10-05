package chapter2;
import java.util.Scanner ;
public class Multiples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int userInput1 = input.nextInt();
        int userInput2 = input.nextInt();

        int trippleUserInput = userInput1 * userInput1 * userInput1;
        int doubleUserInput = userInput2 * userInput2;

        if (trippleUserInput % doubleUserInput == 0){
            System.out.println("Tripple user input is a multiple of duoble user input");
        }
        if (trippleUserInput % doubleUserInput != 0){
            System.out.println("Tripple user input is not a multiple of double user input");
        }



    }
}
