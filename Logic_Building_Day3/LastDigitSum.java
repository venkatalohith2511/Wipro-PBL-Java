import java.util.Scanner;

public class LastDigitSum {
    public static int addLastDigits(int input1, int input2) {
        int lastDigit1 = Math.abs(input1 % 10);
        int lastDigit2 = Math.abs(input2 % 10);
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        System.out.println(addLastDigits(input1, input2));
        scanner.close();
    }
}