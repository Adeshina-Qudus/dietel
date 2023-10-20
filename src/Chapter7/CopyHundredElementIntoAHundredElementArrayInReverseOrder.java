package Chapter7;

import java.util.Arrays;

public class CopyHundredElementIntoAHundredElementArrayInReverseOrder {
    public static void main(String[] args) {


        int [] array = new int[100];
        int [] array2 = new int[100];
        int change = 0;
        for (int count = 0 ; count < array.length ; count++){
            array[count] = count + 1;
        }
        for (int counter = array.length - 1; counter >= 0 ; counter--){
            array2[change] = array[counter];
            change++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The reversed numbers");
        System.out.println(Arrays.toString(array2));
    }
}
