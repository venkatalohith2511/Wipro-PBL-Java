public class A2 {
    public static void main(String[] args) {
        int a1=Integer.parseInt(args[0]);
        int a2=Integer.parseInt(args[1]);
        if(a1>0&&a2>0){
            if(a1%10==a2%10){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else{
            System.out.println("false");
        }
        
    }
}
