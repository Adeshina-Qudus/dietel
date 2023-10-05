package ChibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {

    @Test
    public void testThatNumberIsEven(){
        int number = 5;
        boolean result = Functions.even(number);
        assertFalse(result);
    }

    @Test
    public void testThatNumberIsPrimeNumber(){
        int number = 7;
        boolean result = Functions.primeNumber(number);
        assertTrue(result);
    }
   @Test
    public void testThatNumberIsSubtracted(){
        int result = Functions.subtract(3,7);
        assertEquals(4,result);
    }
    @Test
    public void testThatNumberIsASumOfFactor(){
        int number = 10;
        int result = Functions.factor(number);
        assertEquals(4,result);
    }
    @Test
    public void testThatNumberIsASquareNumber(){
        boolean result = Functions.square(9);
        assertTrue(result);
    }
    @Test
    public void testFactorialOfNumber(){
        int number = 5;
        int result = Functions.factorial(number);
        assertEquals(120,result);

    }
}