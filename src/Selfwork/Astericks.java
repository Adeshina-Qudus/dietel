package Selfwork;

public class Astericks {
    public static void main(String[] args) {

        for (int sum = 1; sum <= 5; sum++) {
            for(int column = 5; column >= sum ; column--){
                System.out.print(column);
            }
            System.out.println();
        }


    }
}
