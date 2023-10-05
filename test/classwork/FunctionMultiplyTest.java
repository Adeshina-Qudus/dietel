package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionMultiplyTest {

    @Test
    public void testThatNumberCanMultiply(){
        int firstNumber = 5;
        int secondNumber = -5;
        int multiply = FunctionMultiply.multiply(firstNumber,secondNumber);
        assertEquals(-25,multiply);
    }
}
