import java.util.Arrays;
import java.util.Scanner;
public class A9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result=new int[arr.length];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=10){
                result[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
}
