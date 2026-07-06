import java.util.Arrays;
import java.util.Scanner;
public class A12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        System.out.println("Enter the elements of the first array:");
        for(int i=0;i<3;i++){
            a[i]=scanner.nextInt();
        }
        int[] b = new int[3];
        System.out.println("Enter the elements of the second array:");
        for(int i=0;i<3;i++){
            b[i]=scanner.nextInt();
        }
        int[] result=new int[2];
        result[0]=a[1];
        result[1]=b[1];
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
}
