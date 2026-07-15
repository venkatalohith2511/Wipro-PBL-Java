import java.time.LocalDate;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = LocalDate.now().getYear();
        
        if(LocalDate.of(year, 1, 1).isLeapYear()) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}