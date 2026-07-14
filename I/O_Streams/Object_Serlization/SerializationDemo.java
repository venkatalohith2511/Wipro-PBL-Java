import java.io.*;
import java.util.Date;

public class SerializationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Venkat", new Date(), "IT", "Developer", 50000);
        
        try {
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("Object serialized to data file");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}