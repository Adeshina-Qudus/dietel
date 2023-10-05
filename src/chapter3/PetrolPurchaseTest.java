package chapter3;
import java.util.Scanner ;
public class PetrolPurchaseTest {

    public static void main(String[] args){

                Scanner input = new Scanner (System.in);
        PetrolPurchase petrol = new PetrolPurchase("total", "feul", 234,1000,10);

        System.out.println("Enter location:");
        String location = input.nextLine();
        petrol.setLocation(location);


        System.out.println("Enter type of petrol :");
        String typeOfPetrol = input.nextLine();
        petrol.setTypeOfPetrol(typeOfPetrol);

        System.out.println("Enter quantity:");
        int quantity = input.nextInt();
        petrol.setQuantity(quantity);

        System.out.println("Enter price per liter:");
        double pricePerLiter = input.nextDouble();
        petrol.setPricePerLiter(pricePerLiter);

        System.out.println("Enter percentage discount:");
        double percentageDiscount = input.nextDouble();
        petrol.setPercentageDiscount(percentageDiscount);


                System.out.println(petrol.getLocation());
                System.out.println( petrol.getTypeOfPetrol());
                System.out.println( petrol.getQuantity());
                System.out.println( petrol.getPricePerLiter());
                System.out.println( petrol.getPercentageDiscount());
                System.out.println( petrol.getPurchaseAmount());


    }


}
