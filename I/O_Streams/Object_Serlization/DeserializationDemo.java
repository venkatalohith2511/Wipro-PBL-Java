import java.io.*;

public class DeserializationDemo {
    public static void main(String[] args) {
        Employee emp = null;
        try {
            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);
            emp = (Employee) ois.readObject();
            ois.close();
            fis.close();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(emp);
    }
}