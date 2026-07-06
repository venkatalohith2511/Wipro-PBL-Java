import java.util.Arrays;
import java.util.Scanner;
public class A11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean element=true;
        for(int i=0;i<n;i++){
            if(arr[i]!=1&&arr[i]!=4){
                element=false;
                break;
            }
        }
    System.out.println(element);
        scanner.close();
    }
}
