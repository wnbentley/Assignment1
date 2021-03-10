public class MergeSort {
    public static void mergeSort(double[] arr) {
        int arrayLength = arr.length; //length of array
        if (arrayLength < 2) { //base case
            return;
        }
        int mid = arrayLength / 2;
        double[] left = new double[mid];  //divide array
        double[] right = new double[arrayLength - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arrayLength; i++) {
            right[i - mid] = arr[i];
        }
        mergeSort(left); //keep dividing till base case
        mergeSort(right);

        merge(arr, left, right, mid, arrayLength - mid); //merge sorted subarrays
    }


    public static void merge(
            double[] arr, double[] arrLeft, double[] arrRight, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (arrLeft[i] <= arrRight[j]) {
                arr[k++] = arrLeft[i++];
            } else {
                arr[k++] = arrRight[j++];
            }
        }
        while (i < left) {
            arr[k++] = arrLeft[i++];
        }
        while (j < right) {
            arr[k++] = arrRight[j++];
        }
    }
}