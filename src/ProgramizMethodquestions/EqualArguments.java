package ProgramizMethodquestions;

public class EqualArguments {
    public static void main(String[] args) {
        int firstNumber = 6;
        int secondNumber = 8;
        myMethod(firstNumber,secondNumber);

    }

    public static void myMethod(int firstNumber , int secondNumber ){

        if (firstNumber == secondNumber){
            System.out.println("Arguments are equal");
        }else {
            System.out.println("Arguments are not equal");
        }
    }
}
