import java.util.ArrayList;
import java.util.function.Consumer;

public class OddEvenConsumer {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=1; i<=10; i++) al.add(i);
        
        Consumer<Integer> c = n -> {
            if(n % 2 == 0) System.out.println(n + " even");
            else System.out.println(n + " odd");
        };
        
        al.forEach(c);
    }
}