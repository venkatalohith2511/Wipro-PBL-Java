import java.time.LocalTime;

public class TimeBefore5h30m {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime before = currentTime.minusHours(5).minusMinutes(30);
        
        System.out.println("Current Time: " + currentTime);
        System.out.println("Time before 5h 30m: " + before);
    }
}