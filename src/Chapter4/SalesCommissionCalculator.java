package Chapter4;

public class SalesCommissionCalculator {

    private double earning;
    private double merchandiseSold;
    private double percentage;
    private double profit;

    public void setEarningPerWeek(double earning) {
        this.earning = earning;
    }
    public double getEarningPerWeek() {
        return earning;
    }
    public void setMerchandiseSold(double merchandise) {
        merchandiseSold += merchandise;
        double name = merchandiseSold;
        String formats= String.format("%4f",name);
        merchandiseSold = Double.parseDouble(formats);
    }
    public double getMerchandiseSold() {
        return  merchandiseSold;
    }

    public void setPercent(double percentage){
        this.percentage = percentage;
    }
    public void setMerchandiseSoldProfit(double profit) {

        this.profit = profit;
    }

    public double getMerchandiseSoldProfit() {

        return (percentage / 100) * merchandiseSold;
    }

    public double getTotalEarnings() {
        return earning + profit;
    }

}
