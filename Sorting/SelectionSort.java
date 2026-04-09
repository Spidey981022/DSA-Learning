import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] sort = {2, 4, 1, 3, 5};
        selectionSort(sort);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    {
                        int temp = arr[i];
                        arr[i] = min;
                        arr[j] = temp;
                    }
                }
                }
            }
        return arr;
    }
}
