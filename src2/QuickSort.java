public class QuickSort {
    public static void quickSort(double arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end); //Select pivot and move

            quickSort(arr, begin, partitionIndex - 1); //keep going on smaller sub arrays
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(double arr[], int begin, int end) {
        double pivot = arr[end]; //choose pivot to be last element
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                double swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        double swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
