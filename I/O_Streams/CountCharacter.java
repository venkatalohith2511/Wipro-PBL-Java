import java.io.*;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileName = sc.nextLine();
        System.out.println("Enter the character to be counted");
        char ch = sc.nextLine().toLowerCase().charAt(0);
        int count = 0;
        try {
            FileReader fr = new FileReader(fileName);
            int i;
            while((i = fr.read()) != -1) {
                char c = Character.toLowerCase((char)i);
                if(c == ch) {
                    count++;
                }
            }
            fr.close();
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + ch + "'.");
        } catch(IOException e) {
            System.out.println("File not found");
        }
    }
}