import java.util.Scanner;

public class SecondLastDigitFinder {
    public static int getSecondLastDigit(int input1) {
        int absValue = Math.abs(input1);
        if (absValue < 10) {
            return -1;
        }
        return (absValue / 10) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(getSecondLastDigit(input));
        scanner.close();
    }
}