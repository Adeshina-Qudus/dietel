package ChibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsLogisticsTest {

    @Test
    public void testSampleInput1Logistics(){
        int collectionRate = 80;
        int result = FunctionsLogistics.logistics(collectionRate);
        assertEquals(45000,result);
    }
    @Test
    public void testSampleInput2Logistics(){
        int collectionRate = 25;
        int result = FunctionsLogistics.logistics(collectionRate);
        assertEquals(9000,result);
    }

}