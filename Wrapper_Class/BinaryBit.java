import java.util.Scanner;

public class BinaryBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer between 1 and 255");
        int num = sc.nextInt();
        
        String binary = Integer.toBinaryString(num);

        String result = String.format("%8s", binary).replace(' ', '0');
        
        System.out.println(result);
    }
}