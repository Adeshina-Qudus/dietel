package ChibuzoAssignment;
import java.util.Scanner ;

public class SumOfEvenAndOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER FIRST NUMBER : ");
        int firstNumber = input.nextInt();

        System.out.print("ENTER SECOND NUMBER : ");
        int secondNumber = input.nextInt();

        System.out.print("ENTER THIRD NUMBER ");
        int thirdNumber = input.nextInt();


        int remainder1 = firstNumber % 2;
        int remainder2 = secondNumber % 2;
        int remainder3 = thirdNumber % 2;

        int userInputEven = 0;
        int userInputOdd = 0;


        if (remainder1 == 0) {
            userInputEven++;
        } else if (remainder1 != 0) {
            userInputOdd++;
        }
        if (remainder2 == 0) {
            userInputEven++;
        } else if (remainder2 != 0) {
            userInputOdd++;
        }
            userInputOdd++;
            System.out.printf("%d EVEN NUMBER ENTERED ", userInputEven);
        System.out.println();
            System.out.printf("%d ODD NUMBER ENTERED", userInputOdd);


        }


    }

