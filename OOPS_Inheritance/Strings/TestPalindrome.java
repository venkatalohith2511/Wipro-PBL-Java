import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();
        
        if(str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}