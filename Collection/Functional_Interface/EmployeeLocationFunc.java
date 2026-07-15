import java.util.ArrayList;
import java.util.function.Function;

class Emp1 {
    int id; String name; String location; double salary;
    Emp1(int id, String name, String location, double salary) {
        this.id = id; this.name = name; this.location = location; this.salary = salary;
    }
}

public class EmployeeLocationFunc {
    public static void main(String[] args) {
        ArrayList<Emp1> al = new ArrayList<Emp1>();
        al.add(new Emp1(1,"Ravi","Pune",50000));
        al.add(new Emp1(2,"Anu","Bangalore",60000));
        al.add(new Emp1(3,"Venkat","Hyderabad",45000));
        al.add(new Emp1(4,"Priya","Pune",70000));
        al.add(new Emp1(5,"Kumar","Chennai",55000));
        
        Function<Emp1, String> f = e -> e.location;
        ArrayList<String> locations = new ArrayList<String>();
        
        for(Emp1 e : al) {
            locations.add(f.apply(e));
        }
        System.out.println("Locations: " + locations);
    }
}