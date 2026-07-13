class Employee implements Cloneable {
    int empId;
    String empName;
    double salary;
    
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public String toString() {
        return "EmpId: " + empId + " | Name: " + empName + " | Salary: " + salary;
    }
}

public class EmployeeClone {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(101, "Venkat", 50000);
            Employee emp2 = (Employee) emp1.clone();
            
            System.out.println("Before changing original:");
            System.out.println("Original: " + emp1);
            System.out.println("Clone   : " + emp2);
            System.out.println();
            
            emp1.empName = "Ravi";
            emp1.salary = 60000;
            
            System.out.println("After changing original:");
            System.out.println("Original: " + emp1);
            System.out.println("Clone   : " + emp2);
            
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}