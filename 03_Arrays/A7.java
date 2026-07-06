import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class A7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr) {
            hs.add(num);
        }
        System.out.println("The unique elements in the array are: " + hs);
        scanner.close();
    }
}
