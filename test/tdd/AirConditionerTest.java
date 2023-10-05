package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {


    @Test
    public void textThatACIsOff (){
         //given that i have an ac my ac is off
         AirConditioner ac = new AirConditioner();


         assertFalse(ac.isOn());
         //when i turn it on
        ac.setOn();
        // check that ac is on
        assertTrue(ac.isOn());
}

    @Test
    public void textThatAcIsOn(){
        //given that i have an ac my ac is on
        AirConditioner ac = new AirConditioner();

        ac.setOn();
        assertTrue(ac.isOn());
        //when i turn it om
        ac.setOn();
        //check
        assertFalse(ac.isOn());
    }
    @Test
    public void testIncreaseTemperature(){
        //given that i have an ac my ac is on
        AirConditioner ac = new AirConditioner();

        ac.setOn();
        assertTrue(ac.isOn());
        assertEquals(16,ac.getTemperature());
        // when i increase temperature
        ac.increaseTemperature();
        //check that temperature is 17
        assertEquals(17,ac.getTemperature());
    }

    @Test
    public void testDecreaseTemperature(){
        //given that i have an ac my ac is on temperature is on 17 degree
        AirConditioner ac = new AirConditioner();
        ac.setOn();
        assertTrue(ac.isOn());
        assertEquals(16,ac.getTemperature());
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        assertEquals(19,ac.getTemperature());
        // when i decrease
        ac.decreaseTemperature();
        //check that temperature is 18 degree
        assertEquals(18,ac.getTemperature());
    }

    @Test
    public void testThatIncreaseTemperatureBeyond30(){
        // given that i have an ac my ac is on my ac temperature is beyond 30
        AirConditioner ac = new AirConditioner();
        ac.setOn();
        assertTrue(ac.isOn());
        assertEquals(16,ac.getTemperature());
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        assertEquals(30,ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(30,ac.getTemperature());
    }
    @Test
    public void testThatTemperatureBelow30(){
        // given that i have an ac my ac is on my ac temperature is below 30
        AirConditioner ac = new AirConditioner();

        ac.setOn();
        assertTrue(ac.isOn());
       assertEquals(16,ac.getTemperature());
        ac.decreaseTemperature();
        ac.decreaseTemperature();
        assertEquals(15,ac.getTemperature());
    }
    }


