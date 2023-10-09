package tdd;

public class AirConditioner {
    private boolean isOn;

    private int temperature = 16;

    public void setOn() {

        if (!isOn) {
            isOn = true;
        } else {
            isOn = false;
        }
    }

    public boolean isOn(){
        return isOn;
    }

    public void increaseTemperature() {
        temperature ++;
        if(temperature > 30){
            this.temperature = 30;
        }
    }

    public int getTemperature() {
        return temperature ;
    }

    public void decreaseTemperature() {
        temperature --;

        if(this.temperature > 16);
        this.temperature = 16;
    }
}

