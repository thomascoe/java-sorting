/**
 * A Collection of sort methods for int arrays
 *
 * @author  Thomas Coe
 * @version 1.0 2013-11-21
 */
public class IntSort {

    /**
     * Sort the array passed in using a BubbleSort algorithm. One of the worst
     * ways to sort an array.
     *
     * @param arr The int[] to sort
     */
    public static void bubbleSort(int[] arr) {
        boolean changed = false;
        do {
            changed = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    changed = true;
                }
            }
        } while (changed);
    }

    /**
     * Sort the array passed in using a SelectionSort algorithm. Inefficient
     * still, worse than InsertionSort.
     *
     * @param arr The int[] to sort
     */
    public static void selectionSort(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, i, minIndex);
                printArr(arr);
            }
        }
    }

    /**
     * Sort the array passed in using an InsertionSort algorithm. More efficient
     * than SelectionSort or BubbleSort, but still pretty inefficient for large
     * arrays.
     *
     * @param arr The int[] to sort
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int prevIndex = i - 1;
            while (prevIndex >= 0 && arr[prevIndex + 1] < arr[prevIndex]) {
                swap(arr, prevIndex + 1, prevIndex);
                prevIndex--;
            }
        }
    }

    /**
     * Swaps the two items in the array provided that correspond to the indexes
     * provided.
     *
     * @param arr    The array containing the items to swap
     * @param index1 The index of the first element to swap
     * @param index2 The index of the element to swap with the first
     */
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /**
     * Print out an array of ints
     *
     * @param arr The int[] to print to the command line
     */
    public static void printArr(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "}");
    }
}
