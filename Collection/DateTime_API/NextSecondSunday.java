import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class NextSecondSunday {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextMonth = today.plusMonths(1);
        
        // Get first day of next month, then find 2nd Sunday
        LocalDate secondSunday = nextMonth.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
        
        System.out.println("Next month second Sunday: " + secondSunday);
    }
}