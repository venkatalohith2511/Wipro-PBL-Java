@FunctionalInterface
interface DigitCountFunc {
    int digitCount(int n);
}

class DigitClass {
    public static int digitCount(int n) {
        int count = 0;
        n = Math.abs(n);
        while(n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}

public class DigitCountMethod {
    public static void main(String[] args) {
        // Static method reference
        DigitCountFunc d = DigitClass::digitCount;
        
        int result = d.digitCount(12345);
        System.out.println("Number of digits: " + result);
    }
}