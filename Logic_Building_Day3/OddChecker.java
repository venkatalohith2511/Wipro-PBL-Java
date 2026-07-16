import java.util.Scanner;

public class OddChecker {
    public static int isOdd(int input1) {
        if (input1 % 2 != 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(isOdd(input));
        scanner.close();
    }
}