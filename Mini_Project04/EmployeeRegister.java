import java.util.*;

class Emp implements Comparable<Emp>{
    String f,l,m,e,a;
    Emp(String f,String l,String m,String e,String a){
        this.f=f; this.l=l; this.m=m; this.e=e; this.a=a;
    }
    public int compareTo(Emp x){
        return f.compareTo(x.f);
    }
}

public class EmployeeRegister{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Employees");
        int n=sc.nextInt();
        ArrayList<Emp> list=new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            System.out.println("Enter Employee "+i+" Details:");
            System.out.println("Enter the Firstname");
            String f=sc.next();
            System.out.println("Enter the Lastname");
            String l=sc.next();
            System.out.println("Enter the Mobile");
            String m=sc.next();
            System.out.println("Enter the Email");
            String e=sc.next();
            System.out.println("Enter the Address");
            String a=sc.next();
            list.add(new Emp(f,l,m,e,a));
        }
        
        Collections.sort(list);
        System.out.println("\nEmployee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n","FirstName","SecondName","MobileNumber","Email","Address");
        
        for(Emp x:list){
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n",x.f,x.l,x.m,x.e,x.a);
        }
    }
}