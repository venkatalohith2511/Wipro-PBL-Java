import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        
        String reversedString2 = "";
        for (int i = string2.length() - 1; i >= 0; i--) {
            reversedString2 = reversedString2 + string2.charAt(i);
        }
        
        String string3 = string1 + " " + reversedString2;
        
        System.out.println(string3);
    }
}