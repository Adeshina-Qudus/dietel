package chapter3;

public class PetrolPurchase {

    private String location;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String location , String typeOfPetrol , int quantity , double pricePerLiter , double percentageDiscount) {
    }

    public void setLocation(String location){
        this.location = location;
        
    }
    public String getLocation(){
        return location;
    }
    public void setTypeOfPetrol(String typeOfPetrol){
        this.typeOfPetrol = typeOfPetrol;
    }
    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPricePerLiter(double pricePerLiter){
        this.typeOfPetrol = typeOfPetrol;
    }
    public double getPricePerLiter() {
        return pricePerLiter;
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount() {
        return percentageDiscount;
    }
    public double getPurchaseAmount(){
        double purchaseAmount = quantity * pricePerLiter ;
       double  netPurchase = (percentageDiscount / 100) * purchaseAmount ;
       double  totalAmount = purchaseAmount - netPurchase ;
        return totalAmount ;
    }


}
