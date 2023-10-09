package chapter2;
import java.util.Scanner;
public class SmallestAndLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers :");
            int userInput1 = input.nextInt();
            int userInupt2 = input.nextInt();
            int userInput3 = input.nextInt();

            int sumUserInput = userInput1 + userInupt2 + userInput3;

            System.out.println(sumUserInput);

            int averageUserInput = sumUserInput / 3;

            System.out.println(averageUserInput);

            int productUserInput = userInput1 * userInupt2 * userInput3;

            System.out.println(productUserInput);

            int min = userInput1;
            int max = userInput1;

            if (userInupt2 < min) {
                min = userInupt2 ;
            } else if (userInupt2 > max) {
                max = userInupt2;
            }
            if (userInput3 < min ){
                min = userInput3;
            } else if (userInput3 > max) {
                max = userInput3;
            }
                System.out.println("The smallest integer is : " + min);
                System.out.println("The largest integer is  : " + max);
    }
}
