import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Sample array of integers
        int[] list = {460, 953, 931, 962, 455};

        // Call the method to find the largest element
        int ans = findLargest(list);

        // Print the result
        System.out.println(ans);
    }

    /**
     * Finds the largest element in an integer array.
     *
     * @param arr the input array
     * @return the largest integer in the array
     */
    public static int findLargest(int[] arr) {
        int n = arr.length; // length of the array
        int i = 0;          // index initializer
        int key = arr[i];   // variable to store the largest value found so far

        // Iterate through each element of the array
        while (i < n) {
            // If current element is greater than or equal to key, update key
            if (key <= arr[i]) {
                key = arr[i];
            }
            i++;
        }

        // Return the largest element
        return key;
    }
}
