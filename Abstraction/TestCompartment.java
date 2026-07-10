import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "This is a First Class Compartment";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "This is a Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "This is a General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "This is a Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] comps = new Compartment[10];
        Random rand = new Random();
        
        for(int i = 0; i < 10; i++) {
            int x = rand.nextInt(4) + 1;
            
            if(x == 1) {
                comps[i] = new FirstClass();
            } else if(x == 2) {
                comps[i] = new Ladies();
            } else if(x == 3) {
                comps[i] = new General();
            } else {
                comps[i] = new Luggage();
            }
        }
        
        for(int i = 0; i < 10; i++) {
            System.out.println(comps[i].notice());
        }
    }
}