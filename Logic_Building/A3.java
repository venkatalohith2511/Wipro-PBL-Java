import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=sc.nextInt();
        }
        
        int negativeCount = 0;
        int nonNegativeCount = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeCount++;
            } else {
                nonNegativeCount++;
            }
        }
        
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Non-negative numbers count: " + nonNegativeCount);
    }
}