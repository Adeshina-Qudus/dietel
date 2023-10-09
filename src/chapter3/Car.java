package chapter3;

public class Car {

    private String model;

    private String year;

    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String setYear() {
        return year;
    }



    public void setPrice(int amount, int discount) {
        double totalPrice = amount -(amount * discount/100);
        this.price = totalPrice;

    }
    public double getPrice (){
    return price;
    }
}

