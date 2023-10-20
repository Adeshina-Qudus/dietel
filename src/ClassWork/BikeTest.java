package ClassWork;

public class BikeTest {
    public static void main(String[] args){

        classwork.Bike bike = new classwork.Bike();

            bike.setName ("benz");
            bike.setOn (true);

        System.out.printf("bike name is %s%n" , bike.getName());
        System.out.printf("bike is set on %s" , bike.getIsOn());



    }
}
