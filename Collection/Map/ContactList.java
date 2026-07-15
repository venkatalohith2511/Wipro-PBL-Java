import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class ContactList {
    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<String, Integer>();
        contacts.put("Venkat", 987654321);
        contacts.put("Anu", 987651234);
        contacts.put("Ravi", 987655678);
        
        // a) Check if key exists
        String name = "Anu";
        if(contacts.containsKey(name)) {
            System.out.println(name + " exists");
        }
        
        // b) Check if value exists
        Integer number = 987654321;
        if(contacts.containsValue(number)) {
            System.out.println(number + " exists");
        }
        
        // c) Use Iterator to loop
        System.out.println("Contact List:");
        Set<Map.Entry<String, Integer>> set = contacts.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}