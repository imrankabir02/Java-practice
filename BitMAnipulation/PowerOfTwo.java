package BitMAnipulation;
import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPowerOfTwo(n)) {
            System.out.println(n+" is a Power of Two");
        } else {
            System.out.println(n+" is not a Power of Two");
        }
        sc.close();
    }
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;

        return (n & (n-1)) == 0;
    }
}
