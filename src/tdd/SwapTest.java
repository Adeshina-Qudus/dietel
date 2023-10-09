package tdd;

import ClassWork.Swap;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;


public class SwapTest {


    @Test
    public void testThatIndexCanSwap(){

        int [] numbers = {6,8,4,9,2,1,};
        int firstNumber = 0;
        int secondNumber = 2;
        int [] result = {4,8,6,9,2,1};
        assertArrayEquals(result, Swap.swapElement(numbers,firstNumber,secondNumber));
    }
}
