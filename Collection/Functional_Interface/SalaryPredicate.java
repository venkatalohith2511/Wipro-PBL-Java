import java.util.ArrayList;
import java.util.function.Predicate;

class Emp2 {
    private int id; private String name; private double salary;
    Emp2(int id, String name, double salary) {
        this.id=id; this.name=name; this.salary=salary;
    }
    public double getSalary() { return salary; }
    public String getName() { return name; }
}

public class SalaryPredicate {
    public static void main(String[] args) {
        ArrayList<Emp2> al = new ArrayList<Emp2>();
        al.add(new Emp2(1,"Ravi",8000));
        al.add(new Emp2(2,"Anu",15000));
        al.add(new Emp2(3,"Venkat",9000));
        al.add(new Emp2(4,"Priya",12000));
        al.add(new Emp2(5,"Kumar",7000));
        
        Predicate<Emp2> p = e -> e.getSalary() < 10000;
        
        System.out.println("Employees with salary < 10000:");
        al.stream().filter(p).forEach(e -> System.out.println(e.getName()));
    }
}