public class BR_Clock extends Time{

    public BR_Clock(int hour, int minute, int second) {
        super(hour, minute, second);
    }

    public BR_Clock(){}

    public String viewClock(){
        return hour + ":" + minute + ":" + second;
    }

    @Override
    public void sync (Time clock){
        this.setHour(clock.getHour());
        this.setMinute(clock.getMinute());
        this.setSecond(clock.getSecond());
    }
}
