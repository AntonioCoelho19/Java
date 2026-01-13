public class App {
    public static void main(String[] args) {
        printTime();
    }

    public static void printTime(){
        Time us = new US_Clock();
        Time br = new BR_Clock();
        
        us.setHour(23);
        us.setMinute(55);
        us.setSecond(40);

        br.sync(us);
        System.out.println("==== Relógio Americano ====");
        System.out.println(us.viewClock());
        System.out.println("==== Relógio Brasileiro ====");
        System.out.println(br.viewClock());
        
    }
}
