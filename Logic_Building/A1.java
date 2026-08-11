public class A1 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        
        System.out.println("Before Swap: a=" + a + ", b=" + b + ", c=" + c);
        
        // Swapping logic
        int temp = c;
        c = b;
        b = a;
        a = temp;
        
        System.out.println("After Swap: a=" + a + ", b=" + b + ", c=" + c);
    }
}