import java.util.ArrayList;
import java.util.function.Function;

public class SumFunction {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=1; i<=10; i++) al.add(i);
        
        Function<ArrayList<Integer>, Integer> f = list -> {
            int sum = 0;
            for(int n : list) sum += n;
            return sum;
        };
        System.out.println("Sum: " + f.apply(al));
    }
}