package BitMAnipulation;
import java.util.*;
public class CountOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int countNumber = countOne(number);

        System.out.println("1\'s presents "+countNumber+ " times");
        sc.close();
    }

    public static int countOne(int n) {
        int count = 0;

        while (n>0) {
            n = (n & (n-1));
            count++;
        }
        return count;
    }
}
