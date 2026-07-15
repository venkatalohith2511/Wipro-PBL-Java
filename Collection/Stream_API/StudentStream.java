import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int mark;
    
    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
    
    public String toString() {
        return rollNo + " " + name + " " + mark;
    }
}

public class StudentStream {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(1, "Amit", 45));
        al.add(new Student(2, "Sneha", 78));
        al.add(new Student(3, "Rahul", 52));
        al.add(new Student(4, "Kavya", 30));
        al.add(new Student(5, "Arjun", 90));
        
        // Filter students who cleared with min 50 marks
        long count = al.stream()
                       .filter(s -> s.mark >= 50)
                       .count();
        
        System.out.println("Students who cleared:");
        al.stream()
          .filter(s -> s.mark >= 50)
          .forEach(System.out::println);
        
        System.out.println("Total count: " + count);
    }
}