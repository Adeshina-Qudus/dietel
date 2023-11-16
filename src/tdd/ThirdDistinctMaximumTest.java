package tdd;

import LeetCode.ThirdDistinctMaximum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdDistinctMaximumTest {




    @Test
    public void testSortMaximumNumber(){
        int [] inputArray = {1,2,3};
        assertArrayEquals(new int[]{3, 2, 1}, ThirdDistinctMaximum.sortMaximum(inputArray));
    }

    @Test
    public void testThirdDistinctMaximum(){
        int [] inputArray = {3,2,1};
        assertEquals(1,ThirdDistinctMaximum.thirdDistinctMaximum(inputArray));
    }
    @Test
    public void testThatIfLengthIsLessThanThreeReturnMaximum(){
        int [] inputArray = {1,2};
        assertEquals(2,ThirdDistinctMaximum.thirdDistinctMaximum(inputArray));
    }
    @Test
    public void testThirdMaximumIfThereIsDuplicate(){
        int [] inputArray = {1,2,2,3};
        assertEquals(1,ThirdDistinctMaximum.thirdDistinctMaximum(inputArray));
    }


}