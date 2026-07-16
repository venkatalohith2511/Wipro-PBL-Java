import java.util.Scanner;

public class SumEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        
        if (sum % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        
        scanner.close();
    }
}