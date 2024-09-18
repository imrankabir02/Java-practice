package BitMAnipulation;

import java.util.Scanner;

public class Get {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int position = sc.nextInt();

        int bitMask = 1<<position;

        if((bitMask & number) == 0) {
            System.out.println("bit is 0");
        } else {
            System.out.println("bit is 1");
        }
        sc.close();
    }
}
