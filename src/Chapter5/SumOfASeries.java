package Chapter5;

public class SumOfASeries {
    public static void main(String[] args) {
        System.out.println("numbers   summation");
        long summation = 0;
        for (int count = 1; count <= 100 ; count++) {
            summation += count;
            System.out.println(count+"  \t\t\t   "+summation);
        }
    }
}
