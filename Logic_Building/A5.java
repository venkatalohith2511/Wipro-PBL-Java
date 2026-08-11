public class A5 {
    public static int calculateSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int c = 10;
        int totalSum = calculateSum(a, b, c);
        System.out.println("The sum of the three numbers is: " + totalSum);
    }
}