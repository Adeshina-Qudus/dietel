package Chapter5;

public class DivisibleBy3 {
    public static void main(String[] args) {

        int sum = 0;

        for (int count = 1 ; count <= 30 ; count++){
           if (count % 3 == 0){
               sum += count;
           }
        }
        System.out.println("sum of numbers divisible by 3 is "+ sum);
    }
}
