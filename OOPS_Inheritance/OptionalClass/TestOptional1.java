import java.util.Optional;

public class TestOptional1 {
    public static void main(String[] args) {
        String names[] = new String[5];
        
        Optional<String> opt = Optional.ofNullable(names[0]);
        
        if(opt.isPresent()) {
            System.out.println(opt.get().length());
        } else {
            System.out.println("Value is null");
        }
    }
}