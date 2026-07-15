import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromePredicate {
    public static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("madam"); al.add("java"); al.add("level"); al.add("code"); al.add("radar");
        al.add("hello"); al.add("noon"); al.add("world"); al.add("civic"); al.add("test");
        
        Predicate<String> p = PalindromePredicate::isPalindrome;
        
        System.out.println("Palindromes:");
        al.stream().filter(p).forEach(System.out::println);
    }
}