public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ravi Kumar", 750000.0, 2020, "NI123456A");
        
        System.out.println(emp1);
        
        emp1.setAnnualSalary(800000.0);
        emp1.setYearStarted(2021);
        
        System.out.println("Updated Salary: " + emp1.getAnnualSalary());
        System.out.println("Updated Year: " + emp1.getYearStarted());
        System.out.println("Name: " + emp1.getName());
    }
}