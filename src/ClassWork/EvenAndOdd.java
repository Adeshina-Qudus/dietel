package classwork;
import java.util.Scanner ;
public class EvenAndOdd {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");

        int userInput = input.nextInt();

        if(userInput %2 == 0) {
            System.out.print(" it is an even number");
        }
        if(userInput %2 != 0) {
            System.out.print("it is an odd number ");
        }

    }
}
