import java.util.Arrays;
import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int x=scanner.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Element "+x+" found at index: "+i);
                return;
            }
        }
        System.out.println(-1);
        scanner.close();
    }
}
