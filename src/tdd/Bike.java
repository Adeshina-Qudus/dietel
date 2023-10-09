package tdd;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class Bike {

    private boolean on;
    private boolean off;

    private int speed;

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return true;
    }
    public boolean isOff() {
        return false;
    }
    public void accelerate() {
        if (speed < 20) {
            speed = speed + 1;
        } else if (speed >= 20 && speed < 30) {
            speed = speed + 2;

        }
        else if (speed >= 30 && speed <= 40){
            speed = speed + 3;
        }
        else {
            speed = speed + 4;
        }
    }


    public int checkAccelerate() {
        return speed;
    }

    public void decelerate() {
         if (speed < 20 ){
            speed = speed - 1;
        }else if (speed >= 20 && speed <= 30){
             speed = speed - 2;
         }else if (speed >= 31 && speed <= 40){
             speed = speed - 3;
         }else if (speed > 46){
             speed = speed - 4;
        }
    }
}
