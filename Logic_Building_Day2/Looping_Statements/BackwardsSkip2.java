public class BackwardsSkip2 {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i -= 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}