import java.util.StringJoiner;

public class TestStringJoiner2 {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi");
        s1.add("Mumbai");
        s1.add("Chennai");
        
        StringJoiner s2 = new StringJoiner("-");
        s2.add("Kolkata");
        s2.add("Bangalore");
        
        StringJoiner merged1 = new StringJoiner("-");
        merged1.merge(s1);
        merged1.merge(s2);
        System.out.println(merged1);
        
        StringJoiner merged2 = new StringJoiner("-");
        merged2.merge(s2);
        merged2.merge(s1);
        System.out.println(merged2);
    }
}