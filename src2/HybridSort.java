public class HybridSort {
    public void hybridSort(double[] arr, int left, int right) { //Has the control loop that selects between another Quicksort or Insertion
        while (left <= right) {

            int partitionIndex = randomQuickSort(arr,left,right); //Quicksort
            if (partitionIndex - left < 15000){ //15000 bound to switch to IS seems high, but it runs the smoothest for me

                quadraticSort(arr,left, partitionIndex+1);
                left = partitionIndex+1;

            }
            if (right - partitionIndex < 15000){ //Right array

                quadraticSort(arr,partitionIndex+1, right);
                right = partitionIndex;
            }

        }
    }
    public int randomQuickSort(double arr[], int left, int right) {
        if (left < right) {
            int partitionIndex = randomPartition(arr, left, right); //Select pivot and move
            return partitionIndex; //return value for control loop
        }
        return -1;
    }
    private int randomPartition(double arr[], int left, int right) { //Partitions array
        random(arr, left, right);   //choose random pivot
        double pivot = arr[right];
        int i = (left - 1);

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;

                double swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        double swapTemp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = swapTemp;

        return i + 1;
    }

    void random(double arr[],int left, int right) //generates random number for pivot
    {

        int pivotRandom = (int)(Math.random() * (right - left + 1) + left);

        double temp1=arr[pivotRandom];
        arr[pivotRandom]=arr[right];
        arr[right]=temp1;
    }

    public void quadraticSort(double[] arr, int left, int right) { //Insertionsort
        for (int i = left ; i < right+1; i++) {  // "i" is 1st unsorted item
            double temp = arr[i];   // Copy
            int j = i-1;
            while (j >= left && arr[j] > temp) {   // Move (loop)
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp;   // Copy back    }}
        }
    }
}
