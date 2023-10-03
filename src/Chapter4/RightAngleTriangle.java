package Chapter4;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the base of a triangle from 1 - 10");
        int userInput = input.nextInt();

        for (int count = 1; count <= userInput; count++){
            for (int j = 1;  j <= count ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
