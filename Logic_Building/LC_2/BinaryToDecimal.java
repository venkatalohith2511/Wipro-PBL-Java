public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(1010));
    }

    public static int binaryToDecimal(long n) {
        int decimalNum = 0;
        int base = 1;
        while (n > 0) {
            long rem = n % 10;
            decimalNum += (int)(rem * base);
            n /= 10;
            base *= 2;
        }
        return decimalNum;
    }
}