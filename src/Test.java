public class Test {
    public static void main(String[] args) {
                  //Creating the Arrays
        double[] firstTestArray = new double[50000];
        for (int i = 0; i < firstTestArray.length; i++) {
            firstTestArray[i] = Math.random();
        }
        double[] secondTestArray = new double[50000 * 2];
        for (int i = 0; i < secondTestArray.length; i++) {
            secondTestArray[i] = Math.random();
        }
        double[] thirdTestArray = new double[50000 * 3];
        for (int i = 0; i < thirdTestArray.length; i++) {
            thirdTestArray[i] = Math.random();
        }
        double[] fourthTestArray = new double[50000 * 4];
        for (int i = 0; i < fourthTestArray.length; i++) {
            fourthTestArray[i] = Math.random();
        }
        double[] fifthTestArray = new double[50000 * 5];
        for (int i = 0; i < fifthTestArray.length; i++) {
            fifthTestArray[i] = Math.random();
        }
        double[] sixthTestArray = new double[50000 * 6];
        for (int i = 0; i < sixthTestArray.length; i++) {
            sixthTestArray[i] = Math.random();
        }
        double[] seventhTestArray = new double[50000 * 7];
        for (int i = 0; i < seventhTestArray.length; i++) {
            seventhTestArray[i] = Math.random();
        }
        double[] eightTestArray = new double[50000 * 8];
        for (int i = 0; i < eightTestArray.length; i++) {
            eightTestArray[i] = Math.random();
        }
        double[] ninthTestArray = new double[50000 * 9];
        for (int i = 0; i < ninthTestArray.length; i++) {
            ninthTestArray[i] = Math.random();
        }
        double[] tenthTestArray = new double[50000 * 10];
        for (int i = 0; i < tenthTestArray.length; i++) {
            tenthTestArray[i] = Math.random();
        }
        //Testing Running Time of Each Algro, commented in and out to save time
                     //****************bubblesort********************
       /* long startTime = System.currentTimeMillis();
        BubbleSort.bubbleSort(firstTestArray);
        long endTime = System.currentTimeMillis();
        System.out.println("BubbleSort 50,000 took " + (endTime - startTime) + " milliseconds");

        long startTime2 = System.currentTimeMillis();
        BubbleSort.bubbleSort(secondTestArray);
        long endTime2 = System.currentTimeMillis();
        System.out.println("BubbleSort 100,000 took " + (endTime2 - startTime2) + " milliseconds");

        long startTime3 = System.currentTimeMillis();
        BubbleSort.bubbleSort(thirdTestArray);
        long endTime3 = System.currentTimeMillis();
        System.out.println("BubbleSort 150,000 took " + (endTime3- startTime3) + " milliseconds");

        long startTime4 = System.currentTimeMillis();
        BubbleSort.bubbleSort(fourthTestArray);
        long endTime4 = System.currentTimeMillis();
        System.out.println("BubbleSort 200,000 took " + (endTime4 - startTime4) + " milliseconds");

        long startTime5 = System.currentTimeMillis();
        BubbleSort.bubbleSort(fifthTestArray);
        long endTime5 = System.currentTimeMillis();
        System.out.println("BubbleSort 250,000 took " + (endTime5 - startTime5) + " milliseconds");

        long startTime6 = System.currentTimeMillis();
        BubbleSort.bubbleSort(sixthTestArray);
        long endTime6 = System.currentTimeMillis();
        System.out.println("BubbleSort 300,000 took " + (endTime6 - startTime6) + " milliseconds");

        long startTime7 = System.currentTimeMillis();
        BubbleSort.bubbleSort(seventhTestArray);
        long endTime7 = System.currentTimeMillis();
        System.out.println("BubbleSort 350,000 took " + (endTime7- startTime7) + " milliseconds");

        long startTime8 = System.currentTimeMillis();
        BubbleSort.bubbleSort(eightTestArray);
        long endTime8 = System.currentTimeMillis();
        System.out.println("BubbleSort 400,000 took " + (endTime8 - startTime8) + " milliseconds");

        long startTime9 = System.currentTimeMillis();
        BubbleSort.bubbleSort(ninthTestArray);
        long endTime9 = System.currentTimeMillis();
        System.out.println("BubbleSort 450,000 took " + (endTime9 - startTime9) + " milliseconds");

        long startTime10 = System.currentTimeMillis();
        BubbleSort.bubbleSort(tenthTestArray);
        long endTime10 = System.currentTimeMillis();
        System.out.println("BubbleSort 500,000 took " + (endTime10 - startTime10) + " milliseconds");*/

            //***************Insertion Sort*******************
        /*long startTime = System.currentTimeMillis();
        InsertionSort.sort(firstTestArray);
        long endTime = System.currentTimeMillis();
        System.out.println("InsertionSort 50,000 took " + (endTime - startTime) + " milliseconds");

        long startTime2 = System.currentTimeMillis();
        InsertionSort.sort(secondTestArray);
        long endTime2 = System.currentTimeMillis();
        System.out.println("InsertionSort 100,000 took " + (endTime2 - startTime2) + " milliseconds");

        long startTime3 = System.currentTimeMillis();
        InsertionSort.sort(thirdTestArray);
        long endTime3 = System.currentTimeMillis();
        System.out.println("InsertionSort 150,000 took " + (endTime3- startTime3) + " milliseconds");

        long startTime4 = System.currentTimeMillis();
        InsertionSort.sort(fourthTestArray);
        long endTime4 = System.currentTimeMillis();
        System.out.println("InsertionSort 200,000 took " + (endTime4 - startTime4) + " milliseconds");

        long startTime5 = System.currentTimeMillis();
        InsertionSort.sort(fifthTestArray);
        long endTime5 = System.currentTimeMillis();
        System.out.println("InsertionSort 250,000 took " + (endTime5 - startTime5) + " milliseconds");

        long startTime6 = System.currentTimeMillis();
        InsertionSort.sort(sixthTestArray);
        long endTime6 = System.currentTimeMillis();
        System.out.println("InsertionSort 300,000 took " + (endTime6 - startTime6) + " milliseconds");

        long startTime7 = System.currentTimeMillis();
        InsertionSort.sort(seventhTestArray);
        long endTime7 = System.currentTimeMillis();
        System.out.println("InsertionSort 350,000 took " + (endTime7- startTime7) + " milliseconds");

        long startTime8 = System.currentTimeMillis();
        InsertionSort.sort(eightTestArray);
        long endTime8 = System.currentTimeMillis();
        System.out.println("InsertionSort 400,000 took " + (endTime8 - startTime8) + " milliseconds");

        long startTime9 = System.currentTimeMillis();
        InsertionSort.sort(ninthTestArray);
        long endTime9 = System.currentTimeMillis();
        System.out.println("InsertionSort 450,000 took " + (endTime9 - startTime9) + " milliseconds");

        long startTime10 = System.currentTimeMillis();
        InsertionSort.sort(tenthTestArray);
        long endTime10 = System.currentTimeMillis();
        System.out.println("InsertionSort 500,000 took " + (endTime10 - startTime10) + " milliseconds");*/

                //**************SelectionSort***************
        /*long startTime = System.currentTimeMillis();
        SelectionSort.sort(firstTestArray);
        long endTime = System.currentTimeMillis();
        System.out.println("SelectionSort 50,000 took " + (endTime - startTime) + " milliseconds");

        long startTime2 = System.currentTimeMillis();
        SelectionSort.sort(secondTestArray);
        long endTime2 = System.currentTimeMillis();
        System.out.println("SelectionSort 100,000 took " + (endTime2 - startTime2) + " milliseconds");

        long startTime3 = System.currentTimeMillis();
        SelectionSort.sort(thirdTestArray);
        long endTime3 = System.currentTimeMillis();
        System.out.println("SelectionSort 150,000 took " + (endTime3- startTime3) + " milliseconds");

        long startTime4 = System.currentTimeMillis();
        SelectionSort.sort(fourthTestArray);
        long endTime4 = System.currentTimeMillis();
        System.out.println("SelectionSort 200,000 took " + (endTime4 - startTime4) + " milliseconds");

        long startTime5 = System.currentTimeMillis();
        SelectionSort.sort(fifthTestArray);
        long endTime5 = System.currentTimeMillis();
        System.out.println("SelectionSort 250,000 took " + (endTime5 - startTime5) + " milliseconds");

        long startTime6 = System.currentTimeMillis();
        SelectionSort.sort(sixthTestArray);
        long endTime6 = System.currentTimeMillis();
        System.out.println("SelectionSort 300,000 took " + (endTime6 - startTime6) + " milliseconds");

        long startTime7 = System.currentTimeMillis();
        SelectionSort.sort(seventhTestArray);
        long endTime7 = System.currentTimeMillis();
        System.out.println("SelectionSort 350,000 took " + (endTime7- startTime7) + " milliseconds");

        long startTime8 = System.currentTimeMillis();
        SelectionSort.sort(eightTestArray);
        long endTime8 = System.currentTimeMillis();
        System.out.println("SelectionSort 400,000 took " + (endTime8 - startTime8) + " milliseconds");

        long startTime9 = System.currentTimeMillis();
        SelectionSort.sort(ninthTestArray);
        long endTime9 = System.currentTimeMillis();
        System.out.println("SelectionSort 450,000 took " + (endTime9 - startTime9) + " milliseconds");

        long startTime10 = System.currentTimeMillis();
        SelectionSort.sort(tenthTestArray);
        long endTime10 = System.currentTimeMillis();
        System.out.println("SelectionSort 500,000 took " + (endTime10 - startTime10) + " milliseconds");*/

        /*            //********MergeSort***********
        long startTime = System.currentTimeMillis();
        MergeSort.mergeSort(firstTestArray);
        long endTime = System.currentTimeMillis();
        System.out.println("MergeSort 50,000 took " + (endTime - startTime) + " milliseconds");

        long startTime2 = System.currentTimeMillis();
        MergeSort.mergeSort(secondTestArray);
        long endTime2 = System.currentTimeMillis();
        System.out.println("MergeSort 100,000 took " + (endTime2 - startTime2) + " milliseconds");

        long startTime3 = System.currentTimeMillis();
        MergeSort.mergeSort(thirdTestArray);
        long endTime3 = System.currentTimeMillis();
        System.out.println("MergeSort 150,000 took " + (endTime3- startTime3) + " milliseconds");

        long startTime4 = System.currentTimeMillis();
        MergeSort.mergeSort(fourthTestArray);
        long endTime4 = System.currentTimeMillis();
        System.out.println("MergeSort 200,000 took " + (endTime4 - startTime4) + " milliseconds");

        long startTime5 = System.currentTimeMillis();
        MergeSort.mergeSort(fifthTestArray);
        long endTime5 = System.currentTimeMillis();
        System.out.println("MergeSort 250,000 took " + (endTime5 - startTime5) + " milliseconds");

        long startTime6 = System.currentTimeMillis();
        MergeSort.mergeSort(sixthTestArray);
        long endTime6 = System.currentTimeMillis();
        System.out.println("MergeSort 300,000 took " + (endTime6 - startTime6) + " milliseconds");

        long startTime7 = System.currentTimeMillis();
        MergeSort.mergeSort(seventhTestArray);
        long endTime7 = System.currentTimeMillis();
        System.out.println("MergeSort 350,000 took " + (endTime7- startTime7) + " milliseconds");

        long startTime8 = System.currentTimeMillis();
        MergeSort.mergeSort(eightTestArray);
        long endTime8 = System.currentTimeMillis();
        System.out.println("MergeSort 400,000 took " + (endTime8 - startTime8) + " milliseconds");

        long startTime9 = System.currentTimeMillis();
        MergeSort.mergeSort(ninthTestArray);
        long endTime9 = System.currentTimeMillis();
        System.out.println("MergeSort 450,000 took " + (endTime9 - startTime9) + " milliseconds");

        long startTime10 = System.currentTimeMillis();
        MergeSort.mergeSort(tenthTestArray);
        long endTime10 = System.currentTimeMillis();
        System.out.println("MergeSort 500,000 took " + (endTime10 - startTime10) + " milliseconds");

        System.out.println(IsSorted.isSorted(sixthTestArray));*/

                        // *******QuickSort*********
        /*long startTime = System.currentTimeMillis();
        QuickSort.quickSort(firstTestArray, 0, firstTestArray.length-1);
        long endTime = System.currentTimeMillis();
        System.out.println("QuickSort 50,000 took " + (endTime - startTime) + " milliseconds");

        long startTime2 = System.currentTimeMillis();
        QuickSort.quickSort(secondTestArray,0, secondTestArray.length-1);
        long endTime2 = System.currentTimeMillis();
        System.out.println("QuickSort 100,000 took " + (endTime2 - startTime2) + " milliseconds");

        long startTime3 = System.currentTimeMillis();
        QuickSort.quickSort(thirdTestArray, 0, thirdTestArray.length-1);
        long endTime3 = System.currentTimeMillis();
        System.out.println("QuickSort 150,000 took " + (endTime3- startTime3) + " milliseconds");

        long startTime4 = System.currentTimeMillis();
        QuickSort.quickSort(fourthTestArray,0, fourthTestArray.length-1);
        long endTime4 = System.currentTimeMillis();
        System.out.println("QuickSort 200,000 took " + (endTime4 - startTime4) + " milliseconds");

        long startTime5 = System.currentTimeMillis();
        QuickSort.quickSort(fifthTestArray, 0, fifthTestArray.length-1);
        long endTime5 = System.currentTimeMillis();
        System.out.println("QuickSort 250,000 took " + (endTime5 - startTime5) + " milliseconds");

        long startTime6 = System.currentTimeMillis();
        QuickSort.quickSort(sixthTestArray, 0, sixthTestArray.length-1);
        long endTime6 = System.currentTimeMillis();
        System.out.println("QuickSort 300,000 took " + (endTime6 - startTime6) + " milliseconds");

        long startTime7 = System.currentTimeMillis();
        QuickSort.quickSort(seventhTestArray, 0 , seventhTestArray.length-1);
        long endTime7 = System.currentTimeMillis();
        System.out.println("QuickSort 350,000 took " + (endTime7- startTime7) + " milliseconds");

        long startTime8 = System.currentTimeMillis();
        QuickSort.quickSort(eightTestArray, 0, eightTestArray.length-1);
        long endTime8 = System.currentTimeMillis();
        System.out.println("QuickSort 400,000 took " + (endTime8 - startTime8) + " milliseconds");

        long startTime9 = System.currentTimeMillis();
        QuickSort.quickSort(ninthTestArray,0 , ninthTestArray.length-1);
        long endTime9 = System.currentTimeMillis();
        System.out.println("QuickSort 450,000 took " + (endTime9 - startTime9) + " milliseconds");

        long startTime10 = System.currentTimeMillis();
        QuickSort.quickSort(tenthTestArray, 0 , tenthTestArray.length-1);
        long endTime10 = System.currentTimeMillis();
        System.out.println("QuickSort 500,000 took " + (endTime10 - startTime10) + " milliseconds");

        System.out.println(IsSorted.isSorted(firstTestArray));*/
    }

}
