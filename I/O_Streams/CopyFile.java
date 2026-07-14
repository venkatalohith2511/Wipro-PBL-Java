import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();
        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();
        try {
            FileReader fr = new FileReader(inputFile);
            FileWriter fw = new FileWriter(outputFile);
            int i;
            while((i = fr.read()) != -1) {
                fw.write(i);
            }
            fr.close();
            fw.close();
            System.out.println("File is copied.");
        } catch(IOException e) {
            System.out.println("File not found");
        }
    }
}