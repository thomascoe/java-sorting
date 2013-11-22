import java.util.Arrays;
/**
 * Main class to test different sorting methods
 *
 * @author  Thomas Coe
 * @version 1.0 2013-11-21
 */
public class Main {
    public static void main(String[] args) {
        long time = 0L;
        //Original array setup
        int[] array = {64,25,12,22,11};
        System.out.print("Original Array: ");
        IntSort.printArr(array);
        System.out.println();
        //Bubble Sort
        System.out.print("Test BubbleSort: ");
        int[] array2 = array.clone();
        time = System.nanoTime();
        IntSort.bubbleSort(array2);
        IntSort.printArr(array2);
        System.out.println("Time: " + (System.nanoTime() - time));
        System.out.println();
        //Selection Sort
        System.out.print("Test SelectionSort: ");
        int[] array3 = array.clone();
        time = System.nanoTime();
        IntSort.selectionSort(array3);
        IntSort.printArr(array3);
        System.out.println("Time: " + (System.nanoTime() - time));
        System.out.println();
        //Insertion Sort
        System.out.print("Test InsertionSort: ");
        int[] array4 = array.clone();
        time = System.nanoTime();
        IntSort.insertionSort(array4);
        IntSort.printArr(array4);
        System.out.println("Time: " + (System.nanoTime() - time));
        System.out.println();
        //Bogo Sort
        System.out.print("Test BogoSort: ");
        int[] array5 = array.clone();
        time = System.nanoTime();
        IntSort.bogoSort(array5);
        IntSort.printArr(array5);
        System.out.println("Time: " + (System.nanoTime() - time));
        System.out.println();
    }
}
