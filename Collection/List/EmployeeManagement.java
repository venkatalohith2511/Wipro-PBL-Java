import java.util.ArrayList;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;
    
    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }
    
    public void GetEmployeeDetails() {
        System.out.println("EmpId: " + empId + " | Name: " + empName + " | Email: " + email + " | Gender: " + gender + " | Salary: " + salary);
    }
}

class EmployeeDB {
    ArrayList<Employee> list;
    
    public EmployeeDB() {
        list = new ArrayList<Employee>();
    }
    
    public boolean addEmployee(Employee e) {
        return list.add(e);
    }
    
    public boolean deleteEmployee(int empId) {
        for(Employee e : list) {
            if(e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }
    
    public String showPaySlip(int empId) {
        for(Employee e : list) {
            if(e.empId == empId) {
                return "PaySlip for " + e.empName + " | EmpId: " + e.empId + " | Salary: " + e.salary;
            }
        }
        return "Employee not found";
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();
        Employee e1 = new Employee(101, "Venkat", "venkat@mail.com", "Male", 50000);
        Employee e2 = new Employee(102, "Anu", "anu@mail.com", "Female", 60000);
        
        db.addEmployee(e1);
        db.addEmployee(e2);
        
        e1.GetEmployeeDetails();
        e2.GetEmployeeDetails();
        
        System.out.println(db.showPaySlip(101));
        db.deleteEmployee(102);
    }
}