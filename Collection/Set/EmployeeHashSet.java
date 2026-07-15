import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<String>();
        employees.add("Venkat");
        employees.add("Anu");
        employees.add("Ravi");
        employees.add("Priya");
        
        Iterator<String> it = employees.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}