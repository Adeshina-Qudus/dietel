package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    public void testThatBikeIsOff() {

        Bike bike = new Bike();
        bike.isOff();
        assertFalse(bike.isOff());
        bike.isOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void testThatBikeIsOn() {

        Bike bike = new Bike();
        bike.isOn();
        assertTrue(bike.isOn());
        bike.isOff();
        assertFalse(bike.isOff());
    }

    @Test
    public void testThatBikeIsOnCanBeAccelerated() {

        Bike bike = new Bike();
        bike.isOn();
        assertTrue(bike.isOn());
        bike.accelerate();
        assertEquals(1, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(5, bike.checkAccelerate());
    }

    @Test
    public void testAccelerateGear2() {

        Bike bike = new Bike();
        bike.isOn();
        assertTrue(bike.isOn());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(20, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(30, bike.checkAccelerate());
    }

    @Test
    public void testThatBikeIncreaseByGear3() {
        Bike bike = new Bike();
        bike.isOn();
        assertTrue(bike.isOn());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(20, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(30, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(42, bike.checkAccelerate());
    }
    @Test
    public void testThatBikeInccreaseByGear4(){
        Bike bike = new Bike();
        bike.isOn();
        assertTrue(bike.isOn());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(20, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(30, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(42, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(58,bike.checkAccelerate());
    }
    @Test
    public void testThatBikeIsDecelerateBy1(){
        Bike bike = new Bike();
        bike.isOn();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(4,bike.checkAccelerate());
        bike.decelerate();
        bike.decelerate();
        assertEquals(2,bike.checkAccelerate());
    }
    @Test
    public  void testThatBikeIsDecelerateBy2(){
        Bike bike = new Bike();
        bike.isOn();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(20, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(30, bike.checkAccelerate());
        bike.decelerate();
        bike.decelerate();
        assertEquals(26,bike.checkAccelerate());
    }
    @Test
    public void testThatBikeCanBeDeccelerateBy3(){
        Bike bike = new Bike();
        bike.isOn();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(20, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(30, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(39, bike.checkAccelerate());
        bike.decelerate();
        bike.decelerate();
        bike.decelerate();
        assertEquals(30,bike.checkAccelerate());
    }
    @Test
    public void testThatCanBeDecelerateBy4(){
        Bike bike = new Bike();
        bike.isOn();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(20, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(30, bike.checkAccelerate());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(54, bike.checkAccelerate());
        bike.decelerate();
        bike.decelerate();
        assertEquals(46,bike.checkAccelerate());
    }
}