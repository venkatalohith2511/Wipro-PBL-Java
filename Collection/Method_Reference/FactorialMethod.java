@FunctionalInterface
interface FactorialFunc {
    int factorial(int n);
}

class FactorialClass {
    public int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class FactorialMethod {
    public static void main(String[] args) {
        FactorialClass obj = new FactorialClass();
        
        // Instance method reference
        FactorialFunc f = obj::factorial;
        
        int result = f.factorial(5);
        System.out.println("Factorial of 5: " + result);
    }
}