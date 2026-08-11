import java.util.*;

public class MergeDescendingArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[4];

        for(int i=0;i<arr1.length;i++)
            arr1[i]=sc.nextInt();

        for(int i=0;i<arr2.length;i++)
            arr2[i]=sc.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Reverse arr1
        for(int l=0,r=arr1.length-1;l<r;l++,r--){
            int temp=arr1[l];
            arr1[l]=arr1[r];
            arr1[r]=temp;
        }

        // Reverse arr2
        for(int l=0,r=arr2.length-1;l<r;l++,r--){
            int temp=arr2[l];
            arr2[l]=arr2[r];
            arr2[r]=temp;
        }

        int[] mergedArr = new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j])
                mergedArr[k++]=arr1[i++];
            else
                mergedArr[k++]=arr2[j++];
        }

        while(i<arr1.length)
            mergedArr[k++]=arr1[i++];

        while(j<arr2.length)
            mergedArr[k++]=arr2[j++];

        for(int num:mergedArr)
            System.out.print(num+" ");

        sc.close();
    }
}