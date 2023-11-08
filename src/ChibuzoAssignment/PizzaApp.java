package ChibuzoAssignment;

public class PizzaApp {

    public static final int largePizzaPrice = 5000;
    public static final int mediumPizzaPrice = 3000;
    public static final int smallPizzaPrice = 1200;
    public static final int largeSlices = 10;
    public static final int mediumSlices = 6;
    public static final int smallSlices = 4;
    public static final int hungryPerson = 4;
    public static final int semiHungryPerson = 2;
    public static final int classicPerson = 1;

    public static int totalSlices(int hungry, int semiHungry, int classic) {
        int hungryTotal = hungry * hungryPerson;
        int semiHungryTotal = semiHungry * semiHungryPerson;
        int classicTotal = classic * classicPerson;
        return hungryTotal + semiHungryTotal + classicTotal;
    }
    public static int recommendLargeSize(int hungry, int semiHungry, int classic) {
        int totalSlices = totalSlices(hungry,semiHungry,classic);
        int totalBox = totalSlices / largeSlices;
        if (totalSlices % largeSlices != 0){
            totalBox += 1;
        }
        return totalBox;
    }
    public static int recommendMediumSize(int hungry, int semiHungry, int classic) {
        int totalSlices = totalSlices(hungry,semiHungry,classic);
        int totalBox = totalSlices / mediumSlices;
        if (totalSlices % mediumSlices != 0){
            totalBox += 1;
        }
        return totalBox;
    }

    public static int recommendSmallSize(int hungry, int semiHungry, int classic) {
        int totalSlices = totalSlices(hungry,semiHungry,classic);
        int totalBox = totalSlices / smallSlices;
        if (totalSlices % smallSlices != 0){
            totalBox += 1;
        }
        return totalBox;
    }

    public static int LargePizzaSlicesLeft(int totalSlices, int totalBox){
        int totalBoxSlice = totalBox * largeSlices;
        return  totalBoxSlice - totalSlices;
    }

    public static int largePizzaAmountRecommended(int totalBox) {
        return totalBox * largePizzaPrice;
    }
    public static int mediumPizzaSlicesLeft(int totalSlices, int totalBox) {
        int totalBoxSlice = totalBox * mediumSlices;
        return totalBoxSlice - totalSlices;
    }

    public static int mediumPizzaAmountRecommended(int totalBox) {
        return totalBox * mediumPizzaPrice;
    }

    public static int smallPizzaSlicesLeft(int totalSlices, int totalBox) {
        int totalBoxSlice = totalBox * smallSlices;
        return totalBoxSlice - totalSlices;
    }
    public static int smallPizzaAmountRecommended(int totalBox) {
        return totalBox * smallPizzaPrice;
    }
}
