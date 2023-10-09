package classwork;
import java.util.Scanner;
public class FindFutureDates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ENTER AN INTEGER FOR TODAY'S DATE ");
        int week = input.nextInt();

        System.out.println("ENTER FUTURE DATE");
        int future = input.nextInt();

        int date = week + future % 7;

        switch (week) {
            case 0 -> System.out.print("TODAY IS SUNDAY ");
            case 1 -> System.out.print("TODAY IS MONDAY ");
            case 2 -> System.out.print("TODAY IS TUESDAY ");
            case 3 -> System.out.print("TODAY IS WEDNESDAY ");
            case 4 -> System.out.print("TODAY IS THURSDAY ");
            case 5 -> System.out.print("TODAY IS FRIDAY ");
            case 6 -> System.out.print("TODAY IS SATURDAY ");
        }
        switch (date){
            case 0 -> System.out.print("AND THE FUTURE DATE IS SUNDAY");
            case 1 -> System.out.print("AND THE FUTURE DATE IS MONDAY");
            case 2 -> System.out.print("AND THE FUTURE DATE IS TUESDAY");
            case 3 -> System.out.print("AND THE FUTURE DATE IS WEDNESDAY");
            case 4 -> System.out.print("AND THE FUTURE DATE IS THURSDAY");
            case 5 -> System.out.print("AND THE FUTURE DATE IS FRIDAY");
            case 6 -> System.out.print("AND THE FUTURE DATE IS SATURDAY");
        }


    }
}
