import java.util.Properties;
import java.util.Iterator;
import java.util.Set;

public class StatesProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("Andhra Pradesh", "Amaravati");
        prop.put("Tamil Nadu", "Chennai");
        prop.put("Karnataka", "Bangalore");
        prop.put("Kerala", "Thiruvananthapuram");
        
        System.out.println("States and Capitals:");
        Set<Object> keys = prop.keySet();
        Iterator<Object> it = keys.iterator();
        while(it.hasNext()) {
            String state = (String)it.next();
            System.out.println(state + " : " + prop.getProperty(state));
        }
    }
}