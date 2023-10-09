package Chapter4;

public class Function {
    public static void main(String[] args) {
    System.out.println(divide(10));
    }
    public static double divide(double number){
        double square = Math.pow(number, 0.50);
        if (number % 5 == 0){
            return square;
        }else
            return number % 5;
    }
}
