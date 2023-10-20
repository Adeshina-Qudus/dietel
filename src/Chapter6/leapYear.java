package Chapter6;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A  YEAR TO CHECK IF IT'S A LEAP YEAR ");
        int year = input.nextInt();
        System.out.println(isLeapYear(year));

    }

    public static boolean isLeapYear(int year){
        if (year < 0 ){
            System.out.println("year must be greater than 0 ");
        }
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
