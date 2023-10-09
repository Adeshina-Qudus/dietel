package chapter3;

import ChibuzoAssignment.BMI;

public class HealthRecord {

    private String firstName;
    private String lastName;
    private String gender;
    private String monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private double heightInInches;
    private double weightInPounds;
    private int maximumHeartRate;

    public HealthRecord(String firstName,String lastName,String gender,String monthOfBirth,int dayOfBirth,int yearOfBirth,double heightInInches,double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return  firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return  lastName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setMonthOfBirth(String monthOfBirth){
        this.monthOfBirth = monthOfBirth;
    }
    public String getMonthOfBirth() {
        return monthOfBirth;
    }
    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    public int getDayOfBirth() {
        return dayOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth() {
        return  yearOfBirth;
    }
    public void setHeightInInches(double heightInInches){
        this.heightInInches = heightInInches;
    }
    public double getHeightInInches() {
        return heightInInches;
    }
    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    public double getWeightInPounds(){
        return weightInPounds;
    }
    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public int getAge(){
        return 2023 - getYearOfBirth();
    }

    public double getTargetHeartRateOne(){
        return getMaximumHeartRate() * 0.50;
    }
    public double getTargetHeartRateTwo(){
        return getMaximumHeartRate() * 0.85;
    }
    public int getBmi(){
        double weightInPound = weightInPounds * 703;
        double totalHeightInInches = heightInInches * heightInInches;
        double bmi = weightInPound / totalHeightInInches;
        return (int) bmi;
    }
}
