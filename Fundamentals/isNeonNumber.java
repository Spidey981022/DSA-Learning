public class Main {

    public static void main(String[] args) {
        int num = 9;
        int ans = isNeonNumber(num);
        System.out.println(ans==num ? "Yes" : "No");
    }

    public static int isNeonNumber(int n) {
        int sum = 0;
        int res = n*n;
        int sq = res;
        System.out.println("Num: " + n);
        while(res>0){
            int rem = res%10;
            sum += rem;
            res = res/10;
        }
        System.out.println("Sum: " + sum + ", Result: " + sq);
        return sum;
    }
}



***********************------JAVASCRIPT CODE--------****************************
// helper.js

class Solution {

    checkNeon(n) {
        // write your code here
        let sum = 0;
        let res = Math.pow(n,2);

        while(res){
            let rem = res%10;
            sum += rem;
            res = Math.floor(res/10);
        }
        return sum==n ? "Yes" : "No";
    }

}

module.exports = Solution;
