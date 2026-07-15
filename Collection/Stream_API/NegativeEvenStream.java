import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenStream {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(-4);
        al.add(7);
        al.add(-8);
        al.add(3);
        al.add(-2);
        al.add(5);
        
        // 1. Filter negative even numbers
        // 2. Store into new ArrayList
        List<Integer> result = al.stream()
                                  .filter(n -> n < 0 && n % 2 == 0)
                                  .collect(Collectors.toList());
        
        // 3. Print
        System.out.println("Negative Even Numbers: " + result);
    }
}