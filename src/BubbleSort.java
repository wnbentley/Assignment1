public class BubbleSort {
    public static void bubbleSort(double[] arr)
    {
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength-1; i++)
            for (int j = 0; j < arrayLength-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
