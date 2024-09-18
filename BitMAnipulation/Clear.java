package BitMAnipulation;
import java.util.*;
public class Clear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int position = sc.nextInt();

        int bitMask = 1<<position;
        int newBitMask = ~(bitMask);

        int newNumber = newBitMask & number;

        System.out.println(newNumber);
        sc.close();
    }
}
