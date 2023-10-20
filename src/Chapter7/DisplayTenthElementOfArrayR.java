package Chapter7;

public class DisplayTenthElementOfArrayR {
    public static void main(String[] args) {


        int [] arrayR = {10,34,65,78,92,94,76,87,9,18};
        int tenthNumber = 0;
        for (int count : arrayR){
            if (count == arrayR[9]){
                tenthNumber = count;
            }
        }
        System.out.println(tenthNumber);
    }
}
