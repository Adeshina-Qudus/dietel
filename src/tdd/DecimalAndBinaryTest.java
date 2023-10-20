package tdd;

import ChibuzoAssignment.DecimalAndBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalAndBinaryTest {



    @Test
    public void testDecimalToBinary(){

        int decimal = 45 ;
        assertEquals("101101", DecimalAndBinary.decimalToBinary(decimal));
    }


    @Test
    public void testBinaryDigitToDecimal(){
        String number = "101101";
        assertEquals(45, DecimalAndBinary.binaryToDecimal(number));
    }

}