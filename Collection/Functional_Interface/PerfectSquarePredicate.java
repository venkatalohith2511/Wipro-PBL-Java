import java.util.ArrayList;
import java.util.function.Predicate;

public class PerfectSquarePredicate {
    public static boolean isPerfectSquare(int n) {
        int sqrt = (int)Math.sqrt(n);
        return sqrt*sqrt == n;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1); al.add(2); al.add(4); al.add(5); al.add(9); al.add(10);
        al.add(16); al.add(20); al.add(25); al.add(30);
        
        Predicate<Integer> p = PerfectSquarePredicate::isPerfectSquare;
        System.out.println("Perfect Squares:");
        al.stream().filter(p).forEach(System.out::println);
    }
}