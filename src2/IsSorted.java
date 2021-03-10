public class IsSorted {
    public static boolean isSorted(double[] array) {
        for (int i = 0; i < array.length - 1; i++) { //Loop through and verify sort, return true if sorted false if not
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}
