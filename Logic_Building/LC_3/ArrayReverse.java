import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed array:");
        for(int i=9;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
