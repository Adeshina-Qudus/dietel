package ChibuzoAssignment;
import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER OR USE [-1] TO QUIT:");
       int userInput = input.nextInt();
        int smallest = userInput;
        int largest = userInput;



        do {
            System.out.println("ENTER A NUMBER OR USE [-1] TO QUIT:");
            userInput = input.nextInt();

            if (userInput < smallest) {
                smallest = userInput;
            } else if (userInput > largest) {
                largest = userInput;


                System.out.println("ENTER A NUMBER OR USE [-1] TO QUIT:");
                userInput = input.nextInt();
            }

        } while (userInput != -1);

        System.out.println("THE SMALLEST NUMBER ENTERED IS : " + smallest);
        System.out.println("THE LARGEST NUMBER ENTERED IS : " + largest);
    }
}
