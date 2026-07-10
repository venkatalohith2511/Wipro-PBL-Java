import java.util.Scanner;

public class TestStringCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int n = str.length();
        String first2 = str.substring(0, 2);
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++) {
            sb.append(first2);
        }
        
        System.out.println(sb.toString());
    }
}