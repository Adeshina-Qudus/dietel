package chapter3;

import java.util.Calendar;

public class TargetHeart {

    private String firstName;
    private String lastName;
    private int birthYear;
    private int calculateMaxHeartRate;


    public TargetHeart(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;

    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int calculateAge() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int age = currentYear - birthYear;
        return age;
    }
public int calculateMaxHeartRate(){
        int calculateMax =  220 - calculateAge();
        return calculateMaxHeartRate = calculateMax;
}
public double getTargetHeartRateOne() {
    double targetHeartRateOne;
    return targetHeartRateOne = calculateMaxHeartRate * 0.50;
}
public  double getTargetHeartRateTwo(){
    double targetHeartRateTwo;
    return targetHeartRateTwo = calculateMaxHeartRate * 0.85;
}

}
