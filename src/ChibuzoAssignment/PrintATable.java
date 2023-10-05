package ChibuzoAssignment;

public class PrintATable{
    public static void main(String[] args) {


           System.out.println("a   \t        b     \t     pow(a,b)");
        System.out.println();

        for(int a = 1 ; a <= 5; a++){
            int b = a + 1;
            int pow = (int) Math.pow(a,b);

            System.out.println(a+ "\t\t\t\t"    +b+  "\t\t\t\t"    +pow);
        }

    }
        }
