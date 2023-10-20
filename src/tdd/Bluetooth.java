package tdd;

public class Bluetooth {

    private boolean isOn;
    private boolean isOff;
    private String connect;
    private boolean disconnect;

    public boolean isOn(){
        isOn = true;
        return true;
    }
    public boolean isOff() {
        isOff = true;
        return true;
    }

    public void connect(String connect) {
        if (connect.equals("connect")) {
            this.connect = String.valueOf(true);
        }else {
            this.connect = String.valueOf(false);
        }
    }
    public boolean connected() {
        return Boolean.parseBoolean(connect);
    }

    public void disconnect(String disconnect) {
        if (disconnect.equals("disconnect")){
            this.disconnect = true;
        }else {
            this.disconnect = false;
        }
    }

    public boolean disconnected() {
        return disconnect;
    }
}
