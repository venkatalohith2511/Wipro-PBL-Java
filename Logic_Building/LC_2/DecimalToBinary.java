public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
    }

    public static long decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        long binaryNum = 0;
        long place = 1;
        while (n > 0) {
            int rem = n % 2;
            binaryNum += rem * place;
            place *= 10;
            n /= 2;
        }
        return binaryNum;
    }
}