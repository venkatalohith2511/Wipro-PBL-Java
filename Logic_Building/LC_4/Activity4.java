import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String counted = "";
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean alreadyCounted = false;
            
            for (int j = 0; j < counted.length(); j++) {
                if (counted.charAt(j) == currentChar) {
                    alreadyCounted = true;
                }
            }
            
            if (!alreadyCounted) {
                int count = 0;
                for (int k = 0; k < input.length(); k++) {
                    if (input.charAt(k) == currentChar) {
                        count++;
                    }
                }
                
                System.out.println(currentChar + " - " + count);
                counted = counted + currentChar;
            }
        }
    }
}