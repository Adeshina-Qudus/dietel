package Chapter7;

public class VariableLengthArgumentList {

    public static void main(String[] args) {
        System.out.println(isAverage(764,86453,974,35,78,98));
    }


    public static int isAverage(int ... numbers) {

        int total = 0;
        for (int count = 0; count < numbers.length; count++) {
            total += numbers[count];
        }
        return total / numbers.length;
    }

}
