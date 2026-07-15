import java.util.TreeSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Java");
        ts.add("Python");
        ts.add("C");
        ts.add("SQL");
        
        System.out.println("Original TreeSet: " + ts);
        
        // a) Reverse the elements
        ArrayList<String> list = new ArrayList<String>(ts);
        Collections.reverse(list);
        System.out.println("Reversed: " + list);
        
        // b) Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = ts.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        // c) Check if element exists
        String search = "Python";
        if(ts.contains(search)) {
            System.out.println(search + " exists in TreeSet");
        } else {
            System.out.println(search + " does not exist");
        }
    }
}