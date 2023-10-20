package tdd;

import Chapter6.BeautifyAStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifyAStringsTest {


    @Test
    public void testAddAFullStop(){

        String words = "adeshina qudus";
        assertEquals("adeshina qudus.", BeautifyAStrings.addFullStop(words));
    }

    @Test
    public void testCapitalFirstWord(){
        String words = "adeshina";
        assertEquals("Adeshina", BeautifyAStrings.capitalizedFirstWord(words));
    }

    @Test
    public void testFullStopCapitalizedFirstWord(){
        String words = "adeshina";
        assertEquals("Adeshina.", BeautifyAStrings.addFullStopCapitalizedFirstWord(words));
    }
}