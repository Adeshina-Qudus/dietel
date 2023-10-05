package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Mp3Test {

    @Test
    public void testThatMp3IsOff(){
        Mp3 mp = new Mp3();
        assertFalse(mp.isOff());
        mp.isOn();
        assertEquals(true, mp.isOn());
    }

    @Test
    public void testThatMp3IsOn(){
        Mp3 mp = new Mp3();
        assertTrue(mp.isOn());
        mp.isOff();
        assertTrue(mp.isOff());
    }

    @Test
    public void testThatMp3IsOnAndCanBeConnectedToBluetooth(){
        Mp3 mp = new Mp3();


    }
}
