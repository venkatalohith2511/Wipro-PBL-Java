import java.util.Scanner;

public class TestRemoveStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*') {
                continue;
            }
            if(i > 0 && str.charAt(i-1) == '*') {
                continue;
            }
            if(i < str.length()-1 && str.charAt(i+1) == '*') {
                continue;
            }
            sb.append(str.charAt(i));
        }
        
        System.out.println(sb.toString());
    }
}