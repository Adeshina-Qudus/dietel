package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestValueIn2By3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [][] array = new int[2][3];
        int smallest = array[0][1];

        for (int count = 0 ; count < array.length ; count++){
            for (int counter = 0 ; counter < array[count].length; counter++){
                System.out.println("Enter a number ");
                array[count][counter] = input.nextInt();
            }
        }
        for (int small = 0 ; small < array.length ; small++){
            if (small < smallest){
                smallest = small;
            }
            System.out.println(small);
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(smallest);
    }
}
