// helper.js

class Solution {

    checkArmstrong(n) {
let count = 0;
let m = n;
let k = n;
let sum = 0;
        // write your code here
        while(n){
            count++;
            n = Math.floor(n/10);
        }
        while(m){
            let rem = m%10;
            sum+= Math.pow(rem,count);
            m = Math.floor(m/10);
        }
        return k==sum ? "Armstrong" : "Not Armstrong"
        }
    }

module.exports = Solution;
