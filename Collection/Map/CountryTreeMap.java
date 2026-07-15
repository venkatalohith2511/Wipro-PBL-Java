import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;

public class CountryTreeMap {
    TreeMap<String, String> M1 = new TreeMap<String, String>();
    
    public TreeMap<String, String> saveCountryCapital(String CountryName, String capital) {
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
    
    public TreeMap<String, String> getSwappedMap() {
        TreeMap<String, String> M2 = new TreeMap<String, String>();
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
        CountryTreeMap obj = new CountryTreeMap();
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        System.out.println(obj.M1);
    }
}