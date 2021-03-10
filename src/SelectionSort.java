public class SelectionSort {
        public static void sort(double[] arr){
            int arrayLength = arr.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < arrayLength - 1; i++) {
                // Find the minimum element in unsorted array
                int minIndex = i;
                for (int j = i + 1; j < arrayLength; j++)
                    if (arr[j] < arr[minIndex])
                        minIndex = j;

                // Swap the found minimum element with the first
                // element
                double temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
}
