import java.util.Optional;

public class TestOptional2 {
    public static void main(String[] args) {
        String address = null;
        
        Optional<String> opt = Optional.ofNullable(address);
        
        System.out.println(opt.orElse("India"));
    }
}