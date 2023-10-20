package Chapter6;

public class IsDivisible {
    public static void main(String[] args) {
        System.out.println(isDivisible(2));
    }
    public static boolean isDivisible(int number) {
        if (number % 5 == 0) {
            return true;
        }
        return false;
    }
}
