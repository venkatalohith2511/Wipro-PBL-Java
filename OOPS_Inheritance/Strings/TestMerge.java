import java.util.Scanner;

public class TestMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        StringBuffer sb = new StringBuffer();
        int i = 0, j = 0;
        
        while(i < a.length() && j < b.length()) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(j));
            i++;
            j++;
        }
        
        while(i < a.length()) {
            sb.append(a.charAt(i));
            i++;
        }
        
        while(j < b.length()) {
            sb.append(b.charAt(j));
            j++;
        }
        
        System.out.println(sb.toString());
    }
}