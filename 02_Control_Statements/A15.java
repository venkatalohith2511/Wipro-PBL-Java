import java.util.Scanner;
public class A15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("The sum of digits is: "+sum);
        sc.close();
    }
}
