package tdd;

import ClassWork.FunctionArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FunctionArrayTest {
    @Test
    public void testThatArrayCanSwitch(){

        String [] list = {"A","M","C","W","I","T"};
        int number = 3;
        assertArrayEquals(new String [] {"A","W","M","I","C","I"} , FunctionArray.switchCharacters(list,number));
    }
}
