import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.ListIterator;

public class ReverseConsumer {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("java"); al.add("python"); al.add("c"); al.add("sql"); al.add("html");
        al.add("css"); al.add("react"); al.add("node"); al.add("spring"); al.add("aws");
        
        Consumer<String> c = s -> {}; // dummy
        ListIterator<String> it = al.listIterator();
        while(it.hasNext()) {
            String s = it.next();
            it.set(new StringBuilder(s).reverse().toString());
        }
        System.out.println("Reversed List: " + al);
    }
}