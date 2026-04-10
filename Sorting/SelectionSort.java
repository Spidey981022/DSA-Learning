/**
 * Selection Sort Implementation in Java
 * -------------------------------------
 * This program demonstrates the Selection Sort algorithm.
 * 
 * Algorithm:
 * - Iterate through the array.
 * - For each position, find the minimum element in the unsorted part.
 * - Swap the minimum element with the current position.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1) (in-place sorting)
 * 
 * Author: Karran
 * GitHub Repo: DSA-Learnings
 */

import java.util.Arrays;

public class SelectionSortExample {

    public static void main(String[] args) {
        // Example array to sort
        int[] arr = {2, 4, 1, 3, 5};

        // Call selection sort
        selectionSort(arr);

        // Print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    /**
     * Performs selection sort on the given array.
     *
     * @param arr The array to be sorted
     * @return The sorted array
     */
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
