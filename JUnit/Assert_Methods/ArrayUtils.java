import java.util.Arrays;

public class ArrayUtils {
    public int[] sortValues(int[] numbers) {
        if (numbers == null) {
            return null;
        }
        int[] sortedArray = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}