package classwork;

public class FunctionMultiply {


    public static int multiply(int firstNumber , int secondNumber){
        if(secondNumber < 0) {
            int add = 0;
            for (int count = firstNumber; count >= 1; count--) {
                add += secondNumber;
            }

            return add;
        }
        int add = 0;
        for (int i = 1 ; i <= secondNumber ; i++){
            add += firstNumber;
        }
return add;
    }
}
