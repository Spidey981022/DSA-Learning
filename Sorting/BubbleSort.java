/**
 * Bubble Sort Implementation in Java
 * ----------------------------------
 * Bubble Sort repeatedly compares adjacent elements
 * and swaps them if they are in the wrong order.
 * After each pass, the largest element "bubbles" to the end.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1) (in-place sorting)
 *
 * Author: Tarun
 * GitHub Repo: DSA-Learnings
 */

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {
        // Example array to sort
        int[] arr = {2, 4, 1, 3, 5};

        // Call bubble sort
        bubbleSort(arr);

        // Print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    /**
     * Performs bubble sort on the given array.
     *
     * @param arr The array to be sorted
     * @return The sorted array
     */
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if adjacent elements are out of order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
