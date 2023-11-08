package Chapter7;

import java.util.Arrays;

public class FiveBySixArray {
    public static void main(String[] args) {


        int [][] array = new int[5][6];
        for (int row = 0 ; row < 6; row++) {
            for (int column = 0; column < 5; column++) {
                array[column][row] = 0;
            }
            System.out.println(Arrays.deepToString(array));
        }
        System.out.println();
    }
}
