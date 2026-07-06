public class Project1 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter an employee id");
            return;
        }

        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        char[] code = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        int id = Integer.parseInt(args[0]);
        boolean found = false;

        for (int i = 0; i < empNo.length; i++) {

            if (empNo[i] == id) {

                found = true;

                    String designation = "";
                    int da = 0;

                    switch (code[i]) {
                        case 'e':
                            designation = "Engineer";
                            da = 20000;
                            break;
                        case 'c':
                            designation = "Consultant";
                            da = 32000;
                            break;
                        case 'k':
                            designation = "Clerk";
                            da = 12000;
                            break;
                        case 'r':
                            designation = "Receptionist";
                            da = 15000;
                            break;
                        case 'm':
                            designation = "Manager";
                            da = 40000;
                            break;
                    }

                    int salary = basic[i] + hra[i] + da - it[i];

                    System.out.printf("%-8s %-10s %-15s %-15s %-10s%n",
                            "Emp No", "Emp Name", "Department", "Designation", "Salary");

                    System.out.printf("%-8d %-10s %-15s %-15s %-10d%n",
                            empNo[i], empName[i], department[i], designation, salary);

                    break;
                }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + id);
        }
    }
}