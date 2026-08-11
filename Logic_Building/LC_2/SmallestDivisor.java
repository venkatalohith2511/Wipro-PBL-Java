public class SmallestDivisor {
    public static void main(String[] args) {
        System.out.println(smallestDivisor(15));
    }

    public static int smallestDivisor(int n) {
        if (n % 2 == 0) {
            return 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}