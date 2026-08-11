import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums=new int[10];
        for(int i=0;i<10;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int[] unique=new int[10];
        int j=0;
        for(int i=0;i<10;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                unique[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(unique[i]+" ");
        }
    }
}
