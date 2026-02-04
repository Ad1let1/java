package p2;

public class Time {
    private int hour, minute, second;
    private boolean check(int hour, int minute, int second){
        if(hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59){
            return false;
        }
        return true;
    }
    public Time(int hour, int minute, int second) {
        if(!check(hour, minute, second)){
            throw new Error("Invalid time");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toStandard(){
        String amPm = hour >= 12 ? "PM" : "AM";
        return String.format("%02d:%02d:%02d %s", hour % 12, minute, second, amPm);
    }
    public void add(Time other){
        int total = this.hour * 3600 + this.minute * 60 + this.second +
                other.hour * 3600 + other.minute * 60 + other.second;
        total %= (60*24*60);
        this.hour = total / 3600;
        this.minute = (total % 3600) / 60;
        this.second = total % 60;
    }

}
