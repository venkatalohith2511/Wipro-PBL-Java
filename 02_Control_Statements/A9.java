import java.util.Scanner;
public class A9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the color code:");
        char code=sc.next().charAt(0);
        code=Character.toUpperCase(code);
        switch(code) {
            case 'R':
                System.out.println("Color: Red");
                break;
            case 'O':
                System.out.println("Color: Orange");
                break;  
            case 'Y':
                System.out.println("Color: Yellow");
                break;  
            case 'G':
                System.out.println("Color: Green");
                break;
            case 'B':
                System.out.println("Color: Blue");
                break;
            default:
                System.out.println("Invalid color code");
        }
        sc.close();
    }
}
