import java.util.ArrayList;
import java.util.Random;

public class PrimeLambda {
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Random r = new Random();
        
        for(int i = 0; i < 25; i++) {
            al.add(r.nextInt(100) + 1);
        }
        
        System.out.println("ArrayList: " + al);
        System.out.println("Prime numbers:");
        
        al.forEach(n -> {
            if(isPrime(n)) {
                System.out.println(n);
            }
        });
    }
}