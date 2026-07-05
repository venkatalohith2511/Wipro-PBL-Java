public class A4 {
    public static void main(String[] args) {
        if(args.length==0) {
            System.out.println("No arguments provided");
        }
        else{
            System.out.println(String.join(" ", args));
        }
    }
}
