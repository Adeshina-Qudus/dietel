package GreeksForGreeks.levelOne;

public class KthSmallestElementFunction {
    public static int [] sortArray(int [] inputArray) {
        for (int outer = 0; outer < inputArray.length; outer++) {
            for (int inner = 0; inner < inputArray.length; inner++) {
                if (inputArray[outer] < inputArray[inner]) {
                    int temp = inputArray[inner];
                    inputArray[inner] = inputArray[outer];
                    inputArray[outer] = temp;
                }
            }
        }
        return inputArray;
    }

    public static int smallestInArray(int [] inputArray){
        sortArray(inputArray);
        int smallest = inputArray[0];
        for (int i : inputArray) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int [] inputArray){
        smallestInArray(sortArray(inputArray));
        int indexSmallest = 0;
        for (int count = 0 ; count < inputArray.length; count++){
            indexSmallest = inputArray[ smallestInArray(sortArray(inputArray))- 1];
        }
        return indexSmallest;
    }
}
