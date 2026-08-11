import java.util.Scanner;
import java.util.Arrays;
public class DescendingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums=new int[10];
        for(int i=0;i<10;i++){
            nums[i]=sc.nextInt();
        }
        // for(int i=1;i<10;i++){
        //     if(nums[i-1]>nums[i]){
        //         int temp=nums[i-1];
        //         nums[i-1]=nums[i];
        //         nums[i]=temp;
        //     }
        // }
        // for(int i=0;i<10;i++){
        //     System.out.print(nums[i]+" ");
        // }
        Arrays.sort(nums);
        for(int i=9;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
    }
}
