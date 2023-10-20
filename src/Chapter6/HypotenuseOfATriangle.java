package Chapter6;

public class HypotenuseOfATriangle {

    public static void main(String[] args) {

        System.out.println(hypotenuse(3.0 ,4.0));
    }


    public static double hypotenuse(double firstSide , double secondSide ){

        double power1 = Math.pow(firstSide, 2);
        double power2 = Math.pow(secondSide, 2);

        return Math.sqrt(power1 + power2);
    }
}
