package chapter2;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer :");

        int userInput = input.nextInt();

        if (userInput % 3 == 0) {
            System.out.println("it is divisible by 3");
        }
        if (userInput % 3 != 0) {
            System.out.println("is is not divisible by 3");
        }
    }
}
