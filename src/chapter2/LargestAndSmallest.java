package chapter2;
 import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter five intrgers :");

        int userInput1 = input.nextInt();
        int userInput2 = input.nextInt();
        int userInput3 = input.nextInt();
        int userInput4 = input.nextInt();
        int userInput5 = input.nextInt();

        int min = userInput1;
        int max = userInput1;

        if (userInput2 < min){
            min = userInput2;
        } else if (userInput2 > max) {
            max = userInput2;
        }
        if (userInput3 < min){
            min = userInput3;
        } else if (userInput3 > max) {
            max = userInput3;
        }
        if(userInput4 < min){
            min = userInput4;
        } else if (userInput4 > max) {
            max = userInput4;
        }
        if(userInput5 < min ){
            min = userInput5;
        }else if (userInput5 > max){
            max = userInput5;
        }
        System.out.println("The smallest integer is : " + min);
        System.out.println("The largest integer is  : " + max);
    }
}
