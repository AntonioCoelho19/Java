public abstract class Time {

    protected int hour;
    protected int minute;
    protected int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(){}

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24) {
            this.hour = 0;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 60) {
            this.minute = 0;
            hour++;
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }
    
    public void setSecond(int second) {
        if (second >= 60) {
            this.second = 0;
            minute++;
        }
        this.second = second;
    }

    public abstract String viewClock();

    public abstract void sync (Time clock);

}
