package Chapter6;

import java.util.Scanner;

public class TemperatureConversions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a kelvin temperature ");
        int userInput = input.nextInt();
        System.out.println("the celsius equivalent is "+celsius(userInput));

        System.out.println("Enter a celsius temperature ");
        int userInput1 = input.nextInt();
        System.out.println("the kelvin equivalent is "+kelvin(userInput));
    }
    public static  double kelvin(int celsiusTemperature){
        return celsiusTemperature + 273.15;
    }
    public static double celsius(int kelvinTemperature){
        return kelvinTemperature - 273.15;
    }
}
