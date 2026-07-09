class Calculator {
    static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2); // Math.pow returns double
    }
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class TestCalculator {
    public static void main(String[] args) {
        int a = 2, b = 5;
        System.out.println(a + " to the power " + b + " = " + Calculator.powerInt(a, b));
        
        double x = 2.5, y = 3;
        System.out.println(x + " to the power " + (int)y + " = " + Calculator.powerDouble(x, (int)y));
    }
}