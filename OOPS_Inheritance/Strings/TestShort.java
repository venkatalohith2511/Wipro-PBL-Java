import java.util.Scanner;

public class TestShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String shortStr;
        String longStr;
        
        if(a.length() < b.length()) {
            shortStr = a;
            longStr = b;
        } else {
            shortStr = b;
            longStr = a;
        }
        
        System.out.println(shortStr + longStr + shortStr);
    }
}