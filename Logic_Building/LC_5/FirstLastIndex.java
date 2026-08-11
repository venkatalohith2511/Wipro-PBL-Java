import java.util.Scanner;
public class FirstLastIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[25];
        for(int i=0;i<25;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<25;i++){
            max=Math.max(max,arr[i]);
        }
        for(int i=0;i<25;i++){
            if(arr[i]==max){
                System.out.println("First index of maximum element: "+i);
                break;
            }
        }   
        for(int i=24;i>=0;i--){
            if(arr[i]==max){
                System.out.println("Last index of maximum element: "+i);
                break;
            }
        }
    }
}
