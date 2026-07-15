import java.util.ArrayList;

public class OddLength {
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
        
        System.out.println("Words with odd length:");
        
        al.forEach(s -> {
            if(s.length() % 2 != 0) {
                System.out.println(s);
            }
        });
    }
}