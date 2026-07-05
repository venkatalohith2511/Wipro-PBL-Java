public class A1 {
    public static void main(String[] args) {
        int a1=Integer.parseInt(args[0]);
        if(a1>0){
            System.out.println("The number is positive");
        }
        else if(a1<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
    }
}
