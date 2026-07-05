public class A6 {
    public static void main(String[] args) {
        char c1=args[0].charAt(0);
        if((c1>='A'&&c1<='Z')||(c1>='a'&&c1<='z')){
            System.out.println("The character is an alphabet");
        }
        else if(c1>='0'&&c1<='9'){
            System.out.println("The character is a digit");
        }
        else{
            System.out.println("The character is a special character");
        }
    }
}
