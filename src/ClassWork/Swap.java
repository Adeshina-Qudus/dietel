package ClassWork;

public class Swap {

    public static int[]
    swapElement(int[] numbers, int firstNumber, int secondNumber) {

        for (int count = 0; count < numbers.length; count++) {
            if (count == firstNumber){
                firstNumber = numbers[count];
                numbers[count] = firstNumber;
            }if (count == secondNumber){
                secondNumber = numbers[count];
                numbers[count] = secondNumber;
            }
        }
        return numbers;
    }
}
