package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class PixelQuantization {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        for (int count = 0; count < array.length; count++) {
            System.out.println("ENTER A NUMBER ");
            array[count] = input.nextInt();
            if (array[count] >= 0 && array[count] <= 20) {
                array[count] = 10;
            }
            if (array[count] >= 21 && array[count] <= 40) {
                array[count] = 30;
            }
            if (array[count] >= 41 && array[count] <= 60) {
                array[count] = 50;
            }
            if (array[count] >= 61 && array[count] <= 80) {
                array[count] = 70;
            }
            if (array[count] >= 81 && array[count] <= 100) {
                array[count] = 90;
            }
            if (array[count] >= 101 && array[count] <= 120) {
                array[count] = 110;
            }
            if (array[count] >= 121 && array[count] <= 140) {
                array[count] = 130;
            }
            if (array[count] >= 141 && array[count] <= 160) {
                array[count] = 150;
            }
            if (array[count] >= 161 && array[count] <= 180) {
                array[count] = 170;
            }if (array[count] >= 181){
                array[count] = 190;
             }
        }
        System.out.println(Arrays.toString(array));
    }
}
