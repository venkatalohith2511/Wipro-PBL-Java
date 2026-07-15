import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExperienceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter joining date yyyy-mm-dd: ");
        String input = sc.next();
        
        LocalDate joiningDate = LocalDate.parse(input); // e.g 2022-01-15
        LocalDate currentDate = LocalDate.now();
        
        Period experience = Period.between(joiningDate, currentDate);
        
        System.out.println("Experience: " + experience.getYears() + " years, " 
                           + experience.getMonths() + " months, " 
                           + experience.getDays() + " days");
        sc.close();
    }
}