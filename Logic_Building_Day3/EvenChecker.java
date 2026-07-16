import java.util.Scanner;

public class EvenChecker {
    public static int isEven(int input1) {
        if (input1 % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(isEven(input));
        scanner.close();
    }
}