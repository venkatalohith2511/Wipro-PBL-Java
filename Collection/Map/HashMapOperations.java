import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Java", "James Gosling");
        map.put("Python", "Guido");
        map.put("C", "Dennis");
        
        // a) Check if key exists
        String key = "Java";
        if(map.containsKey(key)) {
            System.out.println(key + " exists");
        }
        
        // b) Check if value exists
        String value = "Guido";
        if(map.containsValue(value)) {
            System.out.println(value + " exists");
        }
        
        // c) Use Iterator to loop
        System.out.println("Iterating using Iterator:");
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while(it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}