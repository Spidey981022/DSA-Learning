public class Main {

    public static void main(String[] args) {
        int num = 376;
        int ans = isAutomorphic(num);
        System.out.println(ans);
    }

    public static int isAutomorphic(int n) {
        int zero = 1;
        int m = n;
        while (n>0){
            int count = n%10;
            n = n/10;
            zero=zero * 10;
        }
        int flag = (int) Math.pow(m,2)%zero;
        if(m == (flag)){
            System.out.println("Power: " + (int)Math.pow(m,2));
            System.out.println("Automorphic: " + m + " = " + flag );
        }
        else{
            System.out.println("Power: " + (int)Math.pow(m,2));
            System.out.println("Not Automorphic: " + m + " = " + flag );
        }
        return 0;
    }
}
