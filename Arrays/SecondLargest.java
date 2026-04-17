public class Main {

    public static void main(String[] args) {
       int[] list = {460, 953, 433, 962, 455};
//        int[] list = {46, 93, 21, 105, 105, 62, 15, 98};
        int ans = findSecondLargest(list);
        System.out.println(ans);
    }

    public static int findSecondLargest(int[] arr) {
        int j = 1;
        int large = arr[0];
        int secLarge = -1;
        int n = arr.length;

        while(j<n){
            if(large < arr[j]) {
                secLarge = large;
                large = arr[j];
            }
            else{
                    if(secLarge < arr[j]){
                        secLarge = arr[j];
                    }
                }
            j++;
            }
        return secLarge;
    }
    }
