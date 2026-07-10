import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        String lastN = str.substring(str.length() - n);
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++) {
            sb.append(lastN);
        }
        
        System.out.println(sb.toString());
    }
}