import java.util.Scanner;
public class Xelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for(int i=0;i<15;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to find:");
        int element=sc.nextInt();
        int index=-1;
        for(int i=0;i<15;i++){
            if(arr[i]==element){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Element found at index: "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
