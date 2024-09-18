package BitMAnipulation;
import java.util.*;
public class Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int position = sc.nextInt();

        int bitMask = 1<<position;

        int newNumber = bitMask | number;

        System.out.println(newNumber);

        sc.close();
    }
}
