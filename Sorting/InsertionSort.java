import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] sort = {4,3,1,2,5};
        insertionSort(sort);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int j=i-1;
            int temp = arr[i];
            while(j >= 0 && temp < arr[j]){
                    arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
