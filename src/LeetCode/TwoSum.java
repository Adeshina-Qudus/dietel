package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] array = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));

    }


    public static int [] twoSum(int [] array , int target){
        int [] arrayResult = new int[2];
        int count = 0;
        for (int outter = 0 ; outter < array.length ; outter++){
            for (int inner = outter +1 ; inner < array.length ; inner++) {
               if (array[outter] + array[inner] == target){
                   arrayResult[count] = outter;
                   count++;
                   arrayResult[count] = inner;
               }
            }

        }
        return arrayResult;
    }
}
