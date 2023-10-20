package tdd;

import MrChibuzoAssignment.ArrayFunction;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFunctionTest {

    @Test
    public void testThatElementsCanPrintOddPositionsNumbers(){
        int [] element = {2, 6, 9, 52, 75, 9 , 4, };
        assertArrayEquals(new int[] {6, 52 ,9}, ArrayFunction.oddPosition(element));
    }

    @Test
    public void testThatElementsCanPrintEvenPositionsNumbers(){
        int [] element = {2, 6, 9, 52, 75, 9 , 4, };
        assertArrayEquals(new int[] {2 , 9 ,75 ,4 }, ArrayFunction.evenPosition(element));
    }

    @Test
    public void testLargestElementInAList(){
        int [] element = {2, 6, 9, 52, 75, 9 , 4, };
        assertEquals(75,ArrayFunction.largestElement(element));
    }
    @Test
    public void testIfAnElementOccursInAList(){
        int [] list = {5, 10, 15 ,20,25 };
        int element = 10;
        boolean result = ArrayFunction.ifAnElementOccurs(list, element);
        assertTrue(result);
    }
    @Test
    public void testIfListCanReverse(){
        int [] list = {5, 10 , 15 , 20 ,25 };
        assertArrayEquals(new int[] {25, 20 , 15, 10 , 5} , ArrayFunction.reverse(list));
    }

    @Test
    public void testSumNumbersInAListForLoop(){
        int [] list = {5, 5, 10 , 25 ,20 ,5, 7,};
        assertArrayEquals(new int [] {77}, ArrayFunction.sum(list));
    }

    @Test
    public void testSumNumbersInAListDoWhileLoop(){
        int [] list = {5, 5, 10 , 25 ,20 ,5, 7,};
        assertArrayEquals(new int [] {77}, ArrayFunction.sumDoWhile(list));
    }

    @Test
    public void testSumNumbersInAListWhileLoop(){
        int [] list =  {5, 5, 10 , 25 ,20 ,5, 7,};
        assertArrayEquals(new int [] {77} , ArrayFunction.sumWhile(list));
    }
    @Test
    public void testConcatenationOfTwoList(){
        char [] listOne = {'a','b','c'};
        int [] listTwo = {1, 2, 3};
        assertArrayEquals(new String [] {"a","b","c","1","2","3"},ArrayFunction.concantenation(listOne, listTwo));
    }
    @Test
    public void testCombineList(){
        char [] listOne = {'a','b','c'};
        int [] listTwo = {1, 2, 3};
        assertArrayEquals(new String [] {"a","1","b","2","c","3"},ArrayFunction.combineList(listOne , listTwo));
    }

    @Test
    public void testWeatherAStringIsAPalindrome(){
        String [] letters = {"mallam"};
        boolean result = ArrayFunction.stringPalindrome(letters);
        assertEquals(result, false);
    }
//    @Test
//    public void testNumbersAndReturnItsDigits(){
//        int [] number = {2342};
//        assertArrayEquals(new int[] {2, 3, 4, 2} ,ArrayFunction.numberAndReturnDigit(number));
//    }


}