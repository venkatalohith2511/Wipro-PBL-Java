import java.util.Optional;

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String msg) {
        super(msg);
    }
}

class Employee {
    String name;
    
    Employee(String name) {
        this.name = name;
    }
}

public class TestOptional3 {
    public static void main(String[] args) {
        Employee emp = null;
        
        try {
            Optional<Employee> opt = Optional.ofNullable(emp);
            Employee e = opt.orElseThrow(() -> new InvalidEmployeeException("Employee is invalid"));
            System.out.println(e.name);
        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}