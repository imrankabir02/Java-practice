package Recursion;

public class FibonacciSeries {
    public static void fibonacciSeries(int n) {
        fibonacciHelper(0, 1, n);
    }

    public static void fibonacciHelper(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(a+" ");
        fibonacciHelper(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        int n = 30;
        fibonacciSeries(n);
        System.out.println();
    }
}
