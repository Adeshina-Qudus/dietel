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

}