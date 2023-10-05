package ChibuzoAssignment;
import java.util.Scanner;

public class AccelerationVelocity {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER VELOCITY 0:");
        double velocity0 = input.nextDouble();
        System.out.println("ENTER VELOCITY 1:");
        double velocity1 = input.nextDouble();
        System.out.println("ENTER TIME:");
        double time = input.nextDouble();

        double subtract = velocity1 - velocity0;
        double average = subtract / time;
        System.out.printf("THE AVERAGE ACCELERATION IS %.4f " , average);




    }
}
