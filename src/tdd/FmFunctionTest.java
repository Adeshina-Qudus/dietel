package tdd;

import ClassWork.FmFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FmFunctionTest {


    @Test
    public void testThatAStringIsPalindrome(){
        String characters = "mallam";
        Assertions.assertTrue(FmFunction.isPalindrome(characters));
    }


    @Test
    public void test(){
        String first  = "ab#d";
        String second = "ad#d";
        Assertions.assertTrue(FmFunction.compare(first,second));
    }

}
