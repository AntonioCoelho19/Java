public class US_Clock extends Time {

    private String periodIndicator;

    public US_Clock(int hour, int minute, int second, String periodIndicator) {
        super(hour, minute, second);
        this.periodIndicator = periodIndicator;
    }

    public US_Clock(){}

    public String viewClock(){
        if (hour <= 12) {
            periodIndicator = "AM";
        }
        else{
            hour -=12;
            periodIndicator = "PM";
        }
            return hour + ":" + minute + ":" + second + " " + periodIndicator;
    }
    
    @Override
    public void sync (Time clock){
        this.setHour(clock.getHour());
        this.setMinute(clock.getMinute());
        this.setSecond(clock.getSecond());
    }
}
