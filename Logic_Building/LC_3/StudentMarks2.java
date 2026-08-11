import java.util.Scanner;

public class StudentMarks2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[30];
        int[] counts = new int[10];

        for (int i = 0; i < 30; i++) {
            marks[i] = scanner.nextInt();
        }

        for (int i = 0; i < 30; i++) {
            if (marks[i] <= 10) counts[0]++;
            else if (marks[i] <= 20) counts[1]++;
            else if (marks[i] <= 30) counts[2]++;
            else if (marks[i] <= 40) counts[3]++;
            else if (marks[i] <= 50) counts[4]++;
            else if (marks[i] <= 60) counts[5]++;
            else if (marks[i] <= 70) counts[6]++;
            else if (marks[i] <= 80) counts[7]++;
            else if (marks[i] <= 90) counts[8]++;
            else if (marks[i] <= 100) counts[9]++;
        }

        System.out.println("0 to 10%: " + counts[0]);
        System.out.println("11% to 20%: " + counts[1]);
        System.out.println("21% to 30%: " + counts[2]);
        System.out.println("31% to 40%: " + counts[3]);
        System.out.println("41% to 50%: " + counts[4]);
        System.out.println("51% to 60%: " + counts[5]);
        System.out.println("61% to 70%: " + counts[6]);
        System.out.println("71% to 80%: " + counts[7]);
        System.out.println("81% to 90%: " + counts[8]);
        System.out.println("91% to 100%: " + counts[9]);
        
        scanner.close();
    }
}