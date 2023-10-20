package tdd;

public class Mp3 {


    private int increaseVolume;
    private boolean isOn;

    public void turnOff() {
        isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }
    public void turnOn(){
        isOn = true;
    }

    public void increaseVolume() {
        if (increaseVolume < 10){
            increaseVolume = increaseVolume + 1;
        }else if(increaseVolume >= 10 &&  increaseVolume <= 20){
            increaseVolume = increaseVolume + 2;
        }if(increaseVolume > 20){
            increaseVolume = 0;
        }
    }
    public int volume() {
        return increaseVolume;
    }

    public void decreaseVolume() {
        if (increaseVolume < 10){
            increaseVolume = increaseVolume - 1;
        }else if (increaseVolume >=10 && increaseVolume <= 20){
            increaseVolume = increaseVolume - 2;
        }if (increaseVolume > 20){
            increaseVolume = 0;
        }
    }
}

