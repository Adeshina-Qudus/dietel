package HackerRank;

public class FunctionSum {
    public static void main(String[] args) {
        System.out.println(solveMeFirst(100, 1000));
    }
    public static int solveMeFirst(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;

        if(firstNumber <= 1 && secondNumber <= 1000){
            return sum;
        }
        return sum;
}
    public static int floorDivision(int number){
        int num = number / 10;
        int num2 = number % 10;
        return num + num2;
    }
}
