package BitMAnipulation;
import java.util.*;
public class ToggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int position = sc.nextInt();

        int newNumber = toggleBit(number,position);

        System.out.println("Number after toggle in "+position+" is: "+newNumber);

        sc.close();
    }

    public static int toggleBit(int number, int position) {
        int bitMask = 1<<position;
        return number ^ bitMask;
    }
}
