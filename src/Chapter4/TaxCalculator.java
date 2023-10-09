package Chapter4;

public class TaxCalculator {

    private String name;
    private double earnings;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEarnings(double earnings) {
       if (earnings < 0)
        this.earnings = earnings;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setTaxRate(double earnings) {
        if (earnings <= 30_000){
            earnings *= 0.15;
            this.earnings = earnings;
        }else {
            earnings *= 0.20;
            this.earnings = earnings;
        }
    }
    public double getTaxRate(){
        return earnings;
    }

}
