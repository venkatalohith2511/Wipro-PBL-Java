import test.Foundation;

public class AccessTest {
    public static void main(String[] args) {
        Foundation f = new Foundation();
        
        // System.out.println(f.var1); // Error: private - not accessible
        // System.out.println(f.var2); // Error: default - not accessible outside package
        // System.out.println(f.var3); // Error: protected - not accessible outside package without inheritance
        System.out.println(f.var4); // OK: public - accessible
    }
}