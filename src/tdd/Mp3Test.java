package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3Test {


    @Test
    public void testThatMp3Exist(){
        Mp3 mp = new Mp3();
        assertNotNull(mp);
    }
    @Test
    public void testThatMpIsOffAndCanBeOn(){
        Mp3 mp = new Mp3();
        mp.turnOff();
        assertFalse(mp.isOn());
        mp.turnOn();
        assertTrue(mp.isOn());
    }
    @Test
    public void testThatMpIsOnAndCanBeOff(){
        Mp3 mp = new Mp3();
        mp.turnOn();
        assertTrue(mp.isOn());
        mp.turnOff();
        assertFalse(mp.isOn());
    }
    @Test
    public void testThatBluetoothExist(){
       Bluetooth blue = new Bluetooth();
       assertNotNull(blue);
    }
    @Test
    public void testThatMpIsOnAndBluetoothIsOff(){
        Mp3 mp = new Mp3();
        mp.turnOn();
        assertTrue(mp.isOn());
        Bluetooth blue = new Bluetooth();
        blue.isOff();
        assertTrue(blue.isOff());
    }
    @Test
    public void testThatMpIsOnAndBluetoothIsOn(){
        Mp3 mp = new Mp3();
        mp.turnOn();
        assertTrue(mp.isOn());
        Bluetooth blue = new Bluetooth();
        blue.isOn();
        assertTrue(blue.isOn());
    }
    @Test
    public void testThatMpIsOnBluetoothIsOnAndCanBeConnected(){
        Mp3 mp = new Mp3();
        mp.turnOn();
        assertTrue(mp.isOn());
        Bluetooth blue = new Bluetooth();
        blue.isOn();
        assertTrue(blue.isOn());
        blue.connect("connect");
        assertTrue(blue.connected());
    }
    @Test
    public void testThatMpIsOnBluetoothIsOffAndCanBeDisConnected(){
        Mp3 mp = new Mp3();
        mp.turnOn();
        assertTrue(mp.isOn());
        Bluetooth blue = new Bluetooth();
        blue.isOn();
        assertTrue(blue.isOn());
        blue.disconnect("disconnect");
        assertTrue(blue.disconnected());
    }

    @Test
    public void testThatMpIsOnAndVolumeCanBeIncreaseAndCannotGoBeyond20(){
        Mp3 mp = new Mp3();
        mp.turnOn();
        assertTrue(mp.isOn());
        for (int count = 1; count <= 10 ; count++) {
            mp.increaseVolume();
        }
        assertEquals(10,mp.volume());

        for (int count = 1; count <= 5 ; count++ ){
            mp.increaseVolume();
        }
        assertEquals(20, mp.volume());
    }
    @Test
//    public void testThatMpIsOnAndVolumeCanBeDecreaseAndCannotGoBeyond1() {
    public void whenMp3IsOnAndVolumeIsDecreasedItCantGoBeyond1Test(){
        Mp3 mp = new Mp3();
        mp.turnOn();
        assertTrue(mp.isOn());        for (int count = 1; count <= 10 ; count++) {
            mp.increaseVolume();
        }
        assertEquals(10,mp.volume());
//        for (int count = 1; count <= 5 ; count++ ){
//            mp.increaseVolume();
//        }
//        assertEquals(20, mp.volume());
//        for (int count = 1; count <= 5 ; count++){
//            mp.decreaseVolume();
//        }
//        assertEquals(10,mp.volume());
        for (int count = 1; count <= 10 ; count++){
           mp.decreaseVolume();
        }
        assertEquals(1,mp.volume());
    }


}