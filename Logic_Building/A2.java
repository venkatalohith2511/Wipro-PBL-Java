import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of S1 marks:");
        int a=sc.nextInt();
        System.out.print("Enter the value of S2 marks:");
        int b=sc.nextInt();
        System.out.print("Enter the value of S3 marks:");
        int c=sc.nextInt();
        int count=0;
        if(a>=35){
            count++;
        }
        if(b>=35){
            count++;
        }
        if(c>=35){
            count++;
        }
        System.out.println("The number of students passed is "+count);
    }
}
