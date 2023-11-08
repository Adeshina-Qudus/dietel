package tdd;

import ChibuzoAssignment.PizzaApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaAppTest {

    @Test
    public void testThatPizzaLargeSizePriceIs5_000(){
     assertEquals(5000, PizzaApp.largePizzaPrice);
    }
    @Test
    public void testThatPizzaMediumSizeIs3_000(){
        assertEquals(3000, PizzaApp.mediumPizzaPrice);
    }
    @Test
    public void testThatPizzaSmallSizeIs1_200(){
    assertEquals(1200, PizzaApp.smallPizzaPrice);
    }
    @Test
    public void testThatLargePizzaHave10Slices(){
        assertEquals(10, PizzaApp.largeSlices);
    }
    @Test
    public void testThatMediumPizzaHave6Slices(){
        assertEquals(6, PizzaApp.mediumSlices);
    }
    @Test
    public void testThatSmallPizzaHave4Slices(){
        assertEquals(4, PizzaApp.smallSlices);
    }

    @Test
    public void testThatHungryPersonEat4Slices(){
        assertEquals(4, PizzaApp.hungryPerson);
    }
    @Test
    public void testThatSemiHungryPersonEat2Slices(){
        assertEquals(2, PizzaApp.semiHungryPerson);
    }
    @Test
    public void testThatClassicPersonEat1Slice(){
        assertEquals(1, PizzaApp.classicPerson);
    }

    @Test
    public void testPizzaTotalSlices(){
        int hungry = 2;
        int semiHungry = 2;
        int classic = 2;
        assertEquals(14,PizzaApp.totalSlices(hungry,semiHungry,classic));
    }
    @Test
    public void testPizzaLargeSizeRecommended(){
        int hungry = 3;
        int semiHungry = 2;
        int classic = 4;
        assertEquals(2, PizzaApp.recommendLargeSize(hungry,semiHungry,classic));
    }
    @Test
    public void testPizzaMediumSizeRecommended(){
        int hungry = 3;
        int semiHungry = 2;
        int classic = 4;
        assertEquals(4, PizzaApp.recommendMediumSize(hungry,semiHungry,classic));
    }

    @Test
    public void testPizzaSmallSizeRecommended(){
        int hungry = 3;
        int semiHungry = 2;
        int classic = 4;
        assertEquals(5, PizzaApp.recommendSmallSize(hungry,semiHungry,classic));
    }

    @Test
    public void testLargePizzaSlicesLeft(){
        int hungry = 3;
        int semiHungry = 2;
        int classic = 4;
        int totalSlices = PizzaApp.totalSlices(hungry,semiHungry,classic);
        int totalBox = PizzaApp.recommendLargeSize(hungry,semiHungry,classic);
        assertEquals(0,PizzaApp.LargePizzaSlicesLeft(totalSlices,totalBox));
    }
    @Test
    public void testMediumPizzaSlicesLeft(){
        int hungry = 3;
        int semiHungry = 2;
        int classic = 4;
        int totalSlices = PizzaApp.totalSlices(hungry,semiHungry,classic);
        int totalBox = PizzaApp.recommendMediumSize(hungry,semiHungry,classic);
        assertEquals(4,PizzaApp.mediumPizzaSlicesLeft(totalSlices,totalBox));
    }
    @Test
    public void testSmallPizzaSlicesLeft(){
        int hungry = 3;
        int semiHungry = 2;
        int classic = 4;
        int totalSlices = PizzaApp.totalSlices(hungry,semiHungry,classic);
        int totalBox = PizzaApp.recommendSmallSize(hungry,semiHungry,classic);
        assertEquals(0,PizzaApp.smallPizzaSlicesLeft(totalSlices,totalBox));
    }
    @Test
    public void testAmountOfLargePizzaRecommended(){
        int hungry = 3;
        int semiHungry = 2;
        int classic = 4;
        int totalBox = PizzaApp.recommendLargeSize(hungry,semiHungry,classic);
        assertEquals(10_000, PizzaApp.largePizzaAmountRecommended(totalBox));
    }

    @Test
    public void testAmountOfMediumPizzaRecommended(){
        int hungry = 3;
        int semiHungry = 2;
        int classic = 4;
        int totalBox = PizzaApp.recommendMediumSize(hungry,semiHungry,classic);
        assertEquals(12_000,PizzaApp.mediumPizzaAmountRecommended(totalBox));
    }

    @Test
    public void testAmountOfSmallPizzaRecommended(){
        int hungry = 3;
        int semiHungry = 2;
        int classic = 4;
        int totalBox = PizzaApp.recommendSmallSize(hungry,semiHungry,classic);
        assertEquals(6_000, PizzaApp.smallPizzaAmountRecommended(totalBox));
    }
}
