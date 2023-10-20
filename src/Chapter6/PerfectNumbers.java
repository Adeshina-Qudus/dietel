package Chapter6;

public class PerfectNumbers {

    public static void main(String[] args) {
        isPerfect(6);
    }

    public static void isPerfect(int number ){

        int sum = 0;

        for (int count = 1 ; count < number ; count++){
            if (number % count == 0){
                sum += count;
            }
        }
        if (sum == number){
            System.out.println(number+" is a perfect number ");
        }else {
            System.out.println(number+" is not a perfect number");
        }


    }
}
