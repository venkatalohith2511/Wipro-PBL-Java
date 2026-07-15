import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;
    
    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }
    
    public String toString() {
        return empNo + " " + name + " " + age + " " + location; // fixed here
    }
}

public class EmployeeStream {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, "Ravi", 25, "Pune"));
        al.add(new Employee(102, "Anu", 28, "Bangalore"));
        al.add(new Employee(103, "Venkat", 30, "Pune"));
        al.add(new Employee(104, "Priya", 24, "Hyderabad"));
        al.add(new Employee(105, "Kumar", 27, "Pune"));
        
        // Filter employees whose location is Pune
        List<Employee> puneList = al.stream()
                                    .filter(e -> e.location.equals("Pune"))
                                    .collect(Collectors.toList());
        
        System.out.println("Employees in Pune:");
        puneList.forEach(System.out::println);
    }
}