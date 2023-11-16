package tdd;

import LeetCode.MedianOfTwoSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArrayTest {



    @Test
    public void testThatArrayIsMerged(){
        int [] firstArray  = {1,3};
        int [] secondArray = {2};
        assertArrayEquals(new int[] {1,3,2},MedianOfTwoSortedArray.mergedArray(firstArray,secondArray));
    }

    @Test
    public void testThatMergedIsSorted(){
        int [] firstArray = {1,3};
        int [] secondArray = {2};
        assertArrayEquals(new int[] {1,2,3},MedianOfTwoSortedArray.sortMergedArray(firstArray,secondArray));
    }
    @Test
    public void testMergedMedian(){
     int [] mergedSortedArray = {1,2,3,4};
     assertEquals(2.50,MedianOfTwoSortedArray.medianOfMergedArray(mergedSortedArray));
    }
    @Test
    public void testMergedMedianT(){
        int [] mergedSortedArray = {2,2,2,3,4,5,7,8,9,2};
        assertEquals(4.50,MedianOfTwoSortedArray.medianOfMergedArray(mergedSortedArray));
    }


}