package Chapter4;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial());
        System.out.println(constantE());
    }
    public static int factorial(){

        int count = 1;
        for (int loop = 1; loop <= 5 ; loop++){
            count *= loop;
        }
        return count;
    }

    public static int constantE(){
        int add = 0;
        int divide = 1 / factorial();
        add += divide;
        return add;
    }
}
