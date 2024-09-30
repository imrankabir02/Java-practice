package ArrayList;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add
        list.add(0);
        list.add(1);
        list.add(3);

        System.out.println(list);

        list.add(2, 2);

        //get
        int el = list.get(2);
        System.out.println(el);
        System.out.println(list);

        //set
        list.set(1, 9);
        System.out.println(list);

        //delete
        list.remove(1);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //iterate
        for(int i=0; i<size; i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
