import java.util.ArrayList;

public class NumberArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(10);
        list.add(20.5f);
        list.add(30.75);
        list.add(40L);
        System.out.println(list);
    }
}