import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        boolean hasVowel = false;
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                result = result + 'z';
                hasVowel = true;
            } else {
                result = result + c;
            }
        }
        
        if (hasVowel) {
            System.out.println(result);
        } else {
            System.out.println(input);
            System.out.println("No vowels present");
        }
    }
}