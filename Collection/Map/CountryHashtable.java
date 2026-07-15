import java.util.Hashtable;
import java.util.Map;
import java.util.ArrayList;

public class CountryHashtable {
    Hashtable<String, String> M1 = new Hashtable<String, String>();
    
    public Hashtable<String, String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName, capital);
        return M1;
    }
    
    public String getCapital(String CountryName) {
        return M1.get(CountryName);
    }
    
    public String getCountry(String capitalName) {
        for(Map.Entry<String, String> entry : M1.entrySet()) {
            if(entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    public Hashtable<String, String> getSwappedMap() {
        Hashtable<String, String> M2 = new Hashtable<String, String>();
        for(Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }
    
    public ArrayList<String> getCountryList() {
        ArrayList<String> list = new ArrayList<String>();
        for(String key : M1.keySet()) {
            list.add(key);
        }
        return list;
    }
    
    public static void main(String[] args) {
        CountryHashtable obj = new CountryHashtable();
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        System.out.println(obj.M1);
    }
}