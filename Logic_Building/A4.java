import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of number:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("The number is zero");
        }
        else if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
