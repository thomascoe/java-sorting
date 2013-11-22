import java.util.Arrays;
/**
 * Main class to test different sorting methods
 *
 * @author  Thomas Coe
 * @version 1.0 2013-11-21
 */
public class Main {
    public static void main(String[] args) {
        //Original array setup
        int[] array = {64,25,12,22,11};
        System.out.print("Original Array: ");
        IntSort.printArr(array);
        System.out.println();
        //Bubble Sort
        System.out.print("Test BubbleSort: ");
        int[] array2 = array.clone();
        IntSort.bubbleSort(array2);
        IntSort.printArr(array2);
        System.out.println();
        //Selection Sort
        System.out.print("Test SelectionSort: ");
        int[] array3 = array.clone();
        IntSort.bubbleSort(array3);
        IntSort.printArr(array3);
        System.out.println();
        //Insertion Sort
        System.out.print("Test InsertionSort: ");
        int[] array4 = array.clone();
        IntSort.bubbleSort(array4);
        IntSort.printArr(array4);
        System.out.println();
    }
}
