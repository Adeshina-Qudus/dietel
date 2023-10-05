package chapter2;
import java.util.Scanner ;
public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of a circle : ");

        int radius = input.nextInt();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * 2;

        System.out.printf("diameter is : %.2f%n"  , diameter);
        System.out.printf("circumference is : %.2f%n"  , circumference);
        System.out.printf("area is : %.2f%n" , area);


    }
}
