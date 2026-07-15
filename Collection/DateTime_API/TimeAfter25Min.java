import java.time.LocalTime;

public class TimeAfter25Min {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime after25 = currentTime.plusMinutes(25);
        
        System.out.println("Current Time: " + currentTime);
        System.out.println("Time after 25 minutes: " + after25);
    }
}