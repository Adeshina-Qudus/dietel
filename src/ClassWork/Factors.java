package ClassWork;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number :");
        int userInput = input.nextInt();

      int counter = 0;
      //int number;
      for(int number = 1 ; number<=userInput;number++) {
          if (userInput%number == 0) {

              counter++;
          }

      }
        System.out.println("the factor of userInput"+ " is"+ ":" +counter);

            if(counter <= 2){
                System.out.println( userInput+ " is a prime number");
            }
            else{
                System.out.println(userInput+ " is not a prime number");
            }
            }
        }






