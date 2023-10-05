package chapter3;

public class CarTest {

    public static void main(String[] args){

        Car car1 = new Car("c350" , "1999" , 437892762 );
        Car car2 = new Car("270" , "2003" , 234565463 );

        car1.setPrice(5000,5);
         car2.setPrice(2000,7);
        System.out.println(car1.getPrice());
        System.out.println(car2.getPrice());
    }


}
