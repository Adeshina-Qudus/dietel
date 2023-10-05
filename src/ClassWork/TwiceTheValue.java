package classwork;

import java.util.Scanner;

public class TwiceTheValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer : ");
        int userFirstInputX = input.nextInt();
        System.out.println("Enter second integer");
        int userSecondInputY = input.nextInt();


        int sum = userFirstInputX + userSecondInputY;

        int  result = sum * 2;
        System.out.println("THE TWICE THE VALUE OF "+sum+ " IS " +result);
    }
}
