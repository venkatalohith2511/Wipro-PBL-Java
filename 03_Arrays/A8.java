import java.util.Scanner;

public class A8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 6) {
                ignore = true;
            }
            else if (arr[i] == 7 && ignore) {
                ignore = false;
            }
            else if (!ignore) {
                sum += arr[i];
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}