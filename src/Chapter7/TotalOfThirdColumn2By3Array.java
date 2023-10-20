package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class TotalOfThirdColumn2By3Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [][] array = new int[2][3];
        int total = 0;
        for (int count = 0 ; count < array.length ; count++){
            for (int counter = 0 ; counter < array[count].length; counter++){
                System.out.println("Enter number ");
                array[count][counter] = input.nextInt();

            }
        }

        for(int numb = 0;numb < array.length;numb++){
           total += array[numb][2];
        }
        System.out.println(total);
        System.out.println(Arrays.deepToString(array));
    }
}
