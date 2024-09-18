package BitMAnipulation;
import java.util.*;
public class Update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int position = sc.nextInt();
        int oper = sc.nextInt();

        int bitMask = 1<<position;

        if(oper == 1) {
            int newNumber = bitMask | number;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & number;
            System.out.println(newNumber);
        }

        sc.close();
    }
}
