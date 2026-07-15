@FunctionalInterface
interface PrimeFunc {
    PrimeClass check(int n);
}

class PrimeClass {
    public PrimeClass(int n) {
        boolean isPrime = true;
        if(n < 2) isPrime = false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}

public class PrimeConstructor{
    public static void main(String[] args) {
        // Constructor reference
        PrimeFunc p = PrimeClass::new;
        
        p.check(17);
        p.check(20);
    }
}