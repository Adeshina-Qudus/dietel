package ChibuzoTask;

public class SumOfEvenNumberBetween1And10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int count = 1; count <= 10 ; count++){
            if (count % 2 == 0){
                sum += count;
            }
        }
        System.out.println(sum);
    }
}
