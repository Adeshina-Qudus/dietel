package chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        int count = 1;
        int N = 0 ;
        int N2 = 0;
        int N3 = 0;
        int N4 = 0;

        for (int number = 1; number <= 5; number++) {
            N = number;
            N2 = count * number;
            N3 = count * number * number;
            N4 = count * number * number * number;

            System.out.println(N + "\t" + N2 + "\t" + N3 +  "\t" + N4);
count++;

        }



    }
}
