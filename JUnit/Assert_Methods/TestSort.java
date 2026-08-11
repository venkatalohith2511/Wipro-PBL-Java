public class TestSort {

    @Test
    public void testSortValues() {
        ArrayUtils utils = new ArrayUtils();
        int[] input = { 5, 2, 8, 1, 3 };
        int[] expected = { 1, 2, 3, 5, 8 };
        int[] actual = utils.sortValues(input);
        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortValuesWithDuplicates() {
        ArrayUtils utils = new ArrayUtils();
        int[] input = { 4, 1, 4, 2 };
        int[] expected = { 1, 2, 4, 4 };
        
        assertArrayEquals(expected, utils.sortValues(input));
    }
}