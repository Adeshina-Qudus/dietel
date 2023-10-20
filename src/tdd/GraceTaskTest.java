package tdd;

import ClassWork.GraceTask;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraceTaskTest {




  //  @Test
//    public void testDuplicate(){
//
//        int [] arrayNumbers = {1,2,3,3,2,4,5,6};
//        assertArrayEquals(new int[]{2, 3},GraceTask.duplicate(arrayNumbers));
//
//    }

//    @Test
//    public void testPalindrome(){
//
//        String input = "dad";
//        assertTrue(GraceTask.reverse(input));
//    }


    @Test
    public void testDominant(){
        int [] arrayNumber = {9,3,10,7,4};
        assertEquals("1074",GraceTask.dominant(arrayNumber));
    }
}