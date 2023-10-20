package Chapter7;

import java.util.Arrays;

public class TwoByThreeArray {
    public static void main(String[] args) {

        int[][] array = new int[2][3];
        for (int[] count : array ){
            for (int counter : count){
                array[counter] = new int[]{0};
                System.out.print(Arrays.toString(array[counter]));
            }
            System.out.println();
        }

    }

}
