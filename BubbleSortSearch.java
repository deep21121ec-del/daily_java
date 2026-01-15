//Added a Java implementation of Bubble Sort with an optimization to stop early
//        when the array is already sorted. The program accepts dynamic user input,
//        sorts the array in ascending order, and prints the result using Arrays.toString().


import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortSearch {

    /**
     * Sorts an array using Bubble Sort with early-exit optimization
     * @param arr input array
     * @return sorted array (in-place)
     */
    static int[] bubbleSort(int[] arr) {

        // Loop for each pass
        for (int i = 0; i < arr.length; i++) {

            boolean swapped = false;

            // Compare adjacent elements
            for (int j = 1; j < arr.length - i; j++) {

                // Swap if elements are in wrong order
                if (arr[j] < arr[j - 1]) {   // use '>' for descending order
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Read array size
        System.out.print("Enter Count of Numbers: ");
        int range = in.nextInt();

        int[] arr = new int[range];

        // Read array elements
        System.out.print("Enter Numbers Unsorted Way: ");
        for (int i = 0; i < range; i++) {
            arr[i] = in.nextInt();
        }

        // Sort and print array
        System.out.println("Sorted Array: " + Arrays.toString(bubbleSort(arr)));
    }
}
