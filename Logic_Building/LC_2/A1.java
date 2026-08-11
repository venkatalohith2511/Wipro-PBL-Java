import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        n=Math.abs(n);
        int count=0;
        if(n==0){
            count=1;
        }
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
