package ChibuzoAssignment;
import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER :");
        int userInput = input.nextInt();


            int total = 1;
            for(int number = 1 ; number<= userInput ; number++){
                total = total * number;

                System.out.println(total);
        }

    }
}
