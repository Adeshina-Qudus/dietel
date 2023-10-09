package ChibuzoAssignment;

public class FunctionsLogistics {
    public static int logistics(int collectionRate){
        if(collectionRate < 50){
            return collectionRate * 160+ 5000;
        } else if (collectionRate <= 59 ) {
            return collectionRate * 200 + 5000;
        } else if (collectionRate <= 69) {
            return collectionRate * 250 + 5000;
        }
        else {
        return collectionRate * 500 + 5000;
        }

    }
}
