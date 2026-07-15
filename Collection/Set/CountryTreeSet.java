import java.util.TreeSet;
import java.util.Iterator;

public class CountryTreeSet {
    TreeSet<String> H1 = new TreeSet<String>();
    
    public TreeSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }
    
    public String getCountry(String CountryName) {
        Iterator<String> it = H1.iterator();
        while(it.hasNext()) {
            String country = it.next();
            if(country.equals(CountryName)) {
                return country;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        CountryTreeSet obj = new CountryTreeSet();
        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        System.out.println(obj.H1);
        System.out.println(obj.getCountry("Japan"));
        System.out.println(obj.getCountry("UK"));
    }
}