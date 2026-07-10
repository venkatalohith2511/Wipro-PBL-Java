import java.util.Scanner;

public class TestRemoveEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String result = str.substring(1, str.length()-1);
        System.out.println(result);
    }
}