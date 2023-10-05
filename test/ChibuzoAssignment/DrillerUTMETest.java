package ChibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrillerUTMETest {
    @Test
    public void testDrillerUTMECopies0_4(){
        int copies = 4;
        int result = DrillerUTME.UTME(copies);
        assertEquals(8000,result);
    }
    @Test
    public  void testDrillerUTMECopies5_9(){
        int copies = 6;
        int result = DrillerUTME.UTME(copies);
        assertEquals(10800,result);
    }
    @Test
    public void testDrillerUTMECopies10_29(){
        int copies = 10;
        int result = DrillerUTME.UTME(copies);
        assertEquals(16000,result);
    }
    @Test
    public void testDrillerUTMECopies30_49(){
        int copies = 32;
        int result = DrillerUTME.UTME(copies);
        assertEquals(48000,result);
    }
    @Test
    public void testDrillerUTMECopies50_99(){
        int copies = 97;
        int result = DrillerUTME.UTME(copies);
        assertEquals(126100,result);
    }
    @Test
    public void testDrillerUTMECopies100_199(){
        int copies = 140;
        int result = DrillerUTME.UTME(copies);
        assertEquals(168000,result);
    }
    @Test
    public void testDrillerUTMECopies200_499(){
        int copies = 300;
        int result = DrillerUTME.UTME(copies);
        assertEquals(330000,result);
    }
    @Test
    public void testDrillerUTMECopies500Above(){
        int copies = 700;
        int result = DrillerUTME.UTME(copies);
        assertEquals(700000,result);
    }

}