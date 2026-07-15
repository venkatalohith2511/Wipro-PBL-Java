import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "employees.txt";

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter Employee Age: ");
                int age = scanner.nextInt();
                
                System.out.print("Enter Employee Salary: ");
                double salary = scanner.nextDouble();
                
                try {
                    FileWriter writer = new FileWriter(filename, true);
                    writer.write(id + " " + name + " " + age + " " + salary + "\n");
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error writing to file");
                }
            } else if (choice == 2) {
                System.out.println("----Report----");
                try {
                    File file = new File(filename);
                    if (file.exists()) {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error reading from file");
                }
                System.out.println("----End of Report----");
            } else if (choice == 3) {
                break;
            }
        }
        
        scanner.close();
    }
}