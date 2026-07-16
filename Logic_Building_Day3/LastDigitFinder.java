import java.util.Scanner;

public class LastDigitFinder {
    public static int getLastDigit(int input1) {
        return Math.abs(input1 % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(getLastDigit(input));
        scanner.close();
    }
}