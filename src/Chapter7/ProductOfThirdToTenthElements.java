package Chapter7;

import java.util.Arrays;

public class ProductOfThirdToTenthElements {
    public static void main(String[] args) {

        int [] array = new int[100];
        int total = 1;

        for (int count = 0 ; count < array.length ; count++){
            array[count] = total;
            if (count >= 2 && count <= 9){
                array[count] = count * count;
            }
            total++;
        }
        System.out.println(Arrays.toString(array));
    }
}
