import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

class Employee {
    int empId;
    String empName;
    
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    
    public String toString() {
        return "EmpId: " + empId + " | Name: " + empName;
    }
}

public class EmployeeVectorIterator {
    public static void main(String[] args) {
        Vector<Employee> v = new Vector<Employee>();
        v.add(new Employee(101, "Venkat"));
        v.add(new Employee(102, "Anu"));
        v.add(new Employee(103, "Ravi"));
        
        System.out.println("Using Iterator:");
        Iterator<Employee> it = v.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee> e = v.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}