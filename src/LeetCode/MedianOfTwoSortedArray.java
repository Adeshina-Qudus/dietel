package LeetCode;
public class MedianOfTwoSortedArray {


    public static int[] mergedArray(int[] firstArray, int[] secondArray) {
        int [] arrayLength = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, arrayLength, 0, firstArray.length);
        System.arraycopy(secondArray,0,arrayLength,firstArray.length,secondArray.length);
        return  arrayLength;
    }

    public static int[] sortMergedArray(int[] firstArray , int [] secondArray) {
        int [] array = mergedArray(firstArray,secondArray);
        for (int outter = 0; outter < array.length;outter++){
            for (int inner = 0; inner < array.length;inner++){
                    if (array[outter] < array[inner]){
                        int temp = array[inner];
                        array[inner] = array[outter];
                        array[outter] = temp;
                    }
            }
        }
        return array;
    }

    public static double medianOfMergedArray(int[] mergedSortedArray) {
       int divide = 0;
       double result = 0;
       double firstResult = 0;
       double secondResult = 0;
       double sum = 0 ;
        if (mergedSortedArray.length % 2 != 0){
            divide = mergedSortedArray.length / 2;
            result = mergedSortedArray[divide];
        }else {
            divide = mergedSortedArray.length / 2;
            firstResult = mergedSortedArray[divide - 1];
            secondResult = mergedSortedArray[divide];
            sum = firstResult + secondResult ;
            result = sum / 2;
        }
        return result;
    }
}
