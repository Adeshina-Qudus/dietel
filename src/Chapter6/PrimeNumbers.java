package Chapter6;

public class PrimeNumbers {

    public static void main(String[] args) {
        displayPrimeNumbers();
    }


    public static int primeNumbers(int number){

        int counter = 0;
        for (int count = 1 ; count <= number ; count++){
            if (number % count == 0){
                counter++;
            }
        }
        if (counter <= 2 ){
            System.out.println(number+" it is a prime number ");
        }else {
            System.out.println(number+" it is not a prime number ");
        }
        return counter;
    }


    public static void displayPrimeNumbers(){

        int counter = 0;
        for (int count = 2; count < 10000 ; count++){
            for (int num = 1; num <= count;num++) {
                if(count % num == 0) {
                    counter ++;
                }
                if(counter <= 2){
                    System.out.println(count);
                }
            }

        }
        System.out.println();
    }
    }

