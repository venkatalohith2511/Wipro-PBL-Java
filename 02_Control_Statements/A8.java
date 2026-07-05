public class A8 {
    public static void main(String[] args) {
        char c1=args[0].charAt(0);
        if(c1>='a' && c1<='z'){
            char upper=(char)(c1-32);
            System.out.println(c1+"->"+upper);
        }
        else if(c1>='A' && c1<='Z'){
            char lower=(char)(c1+32);
            System.out.println(c1+"->"+lower);
        }
        else{
            System.out.println("Not an alphabet");
        }
    }
}
