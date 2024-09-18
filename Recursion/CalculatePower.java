package Recursion;

public class CalculatePower {

    public static int calPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        // return x * calPower(x, n-1); //height = n + 1

        // height = logn
        if (n % 2 == 0) {
            return calPower(x, n / 2) * calPower(x, n / 2);
        } else {
            return calPower(x, n / 2) * calPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int result = calPower(x, n);
        System.out.println(result);
    }

}
