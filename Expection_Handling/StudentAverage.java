import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String msg) {
        super(msg);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String msg) {
        super(msg);
    }
}

public class StudentAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            for(int s = 1; s <= 2; s++) {
                System.out.println("Enter name of student " + s);
                String name = sc.nextLine();
                
                int total = 0;
                for(int i = 1; i <= 3; i++) {
                    System.out.println("Enter marks of subject " + i);
                    String input = sc.nextLine();
                    int marks = Integer.parseInt(input);
                    
                    if(marks < 0) {
                        throw new NegativeValueException("Marks cannot be negative");
                    }
                    if(marks > 100) {
                        throw new OutOfRangeException("Marks must be between 0-100");
                    }
                    total += marks;
                }
                
                double avg = total / 3.0;
                System.out.println("Average of " + name + " = " + avg);
            }
        } catch(NumberFormatException e) {
            System.out.println("NumberFormatException: Enter valid integer marks");
        } catch(NegativeValueException | OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}