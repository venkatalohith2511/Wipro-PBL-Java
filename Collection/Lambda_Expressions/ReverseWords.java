import java.util.ArrayList;
import java.util.Collections;

public class ReverseWords {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Java");
        al.add("Python");
        al.add("C");
        al.add("SQL");
        al.add("HTML");
        al.add("CSS");
        al.add("React");
        al.add("Node");
        al.add("Spring");
        al.add("AWS");
        
        System.out.println("Original: " + al);
        
        Collections.reverse(al);
        System.out.println("Reversed:");
        
        al.forEach(s -> System.out.println(s));
    }
}