package LeetCode;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class ThirdDistinctMaximum {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(removingDuplicate(new int[]{1, 2, 2, 3})));
        System.out.println(returningDuplicate(new int[]{1, 2, 2, 3}));
    }

    public static int[] sortMaximum(int[] inputArray) {
        for (int outter = 0 ; outter < inputArray.length; outter++){
            for (int inner = 0 ; inner < inputArray.length; inner++){
                if (inputArray[outter] > inputArray[inner]) {
                        int temp = inputArray[inner];
                        inputArray[inner] = inputArray[outter];
                        inputArray[outter] = temp;
                }
            }
        }
        return inputArray;
    }

    public static int [] removingDuplicate(int[] inputArray){
        int [] array = sortMaximum(inputArray);
        for (int outter = 0 ; outter < array.length ;outter++){
            for (int inner = outter + 1 ; inner < array.length ;inner++){
                if (array[outter] == array[inner]){
                    array[inner] = 0;
                }
            }
        }
        return array;
    }

    public static ArrayList<Integer> returningDuplicate(int [] array){
        int [] input = removingDuplicate(sortMaximum(array));
        ArrayList<Integer> change = new ArrayList<>();
        for (int count = 0;count < input.length;count++){
            if (input[count] > 0 ){
                change.add(input[count]);
            }
        }
        return change;
    }
    public static int thirdDistinctMaximum(int[] inputArray) {
        ArrayList<Integer> input = returningDuplicate(removingDuplicate(sortMaximum(inputArray)));
        int maximum = 0;
            if (input.size() < 3 ){
                for (int count = 0 ; count < input.size() ; count++) {
                    if (input.get(count) > maximum) {
                        maximum = input.get(count);
                    }
                }
            }else {
                maximum = input.get(2);
            }
        return maximum;
    }
}
