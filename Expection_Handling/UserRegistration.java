import java.util.Scanner;

class InvalidCountryException extends Exception {
    public InvalidCountryException(String msg) {
        super(msg);
    }
}

public class UserRegistration {
    
    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if(!userCountry.equals("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration ur = new UserRegistration();
        
        System.out.println("Enter username");
        String name = sc.nextLine();
        
        System.out.println("Enter country");
        String country = sc.nextLine();
        
        try {
            ur.registerUser(name, country);
        } catch(InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}