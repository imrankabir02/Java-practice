package Recursion;

public class NaturalNumberSum {

    public static int printSum(int n) {
        // if(i == n) {
        //     sum += i;
        //     System.out.println(sum);
        //     return;
        // }
        // sum += i;
        // printSum(i+1, n, sum);

        if(n == 0) {
            return n;
        }
        return n + printSum(n-1);
    }
    public static void main(String[] args) {
        int result = printSum(5);
        System.out.println(result);
    }
}
