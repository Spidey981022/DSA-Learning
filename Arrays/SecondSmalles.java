public class Main {

    public static void main(String[] args) {
//        int[] list = {460, 953, 433, 962, 455};
        int[] list = {46, 93, 21, 105, 105, 62, 15, 98};
        int ans = findSeccondSmallest(list);
        System.out.println(ans);
    }

    public static int findSeccondSmallest(int[] arr) {
        int j = 1;
        int large = Integer.MAX_VALUE;
        int small = arr[0];
        int n = arr.length;

        if(n<2){
            return small;
        }

            while(j<n){
                if(small > arr[j]){
                    large = small;
                    small = arr[j];
                }
                else if(small < arr[j]){
                    if(large <  arr[j]){
                        break;
                    }
                }
                j++;
            }
            return large;
        }
    }
