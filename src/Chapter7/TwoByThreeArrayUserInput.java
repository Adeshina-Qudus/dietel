package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class TwoByThreeArrayUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] [] array = new int[2][3];

        for (int count = 0 ; count < array.length ; count++){
            for (int counter = 0 ; counter < array[count].length ; counter++){
                System.out.println("Enter a number ");
                array[count][counter] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));

    }
}