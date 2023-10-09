package classwork;

import java.util.Scanner;

public class CertainValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter [A] value");
        int userInputA = input.nextInt();
        System.out.println("enter [x] value");
        int userInputX = input.nextInt();
        System.out.println("enter [Y] value");
        int userInputY = input.nextInt();
        System.out.println("enter [Z] value");
        int userInputZ = input.nextInt();

        int product = userInputX * userInputY * userInputZ;

    }
}
