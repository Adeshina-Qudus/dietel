package chapter3;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute , int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour){
            this.hour = hour ;
            if(hour >= 23)
                this.hour = 0 ;
        }
    public int getHour(){
        return 0;
    }
    public void setMinute(int minute){
        this.minute = minute;
        if(minute >= 59)
            this.hour = 0 ;
    }
    public int getMinute(){
        return 0;
    }
    public void setSecond(int second){
        this.second = second;
        if(second >= 59)
            this.hour = 0;
    }
    public String getDisplayTime(){
        String displayTime = hour+": "+minute+": "+second+":";
        return displayTime;
    }


}
