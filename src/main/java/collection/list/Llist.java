package collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class Llist {

    public static void main(String[] args) {

        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(1);
        llist.add(2);
        llist.add(3);

        Integer [] arr = llist.toArray(new Integer[0]);
        for (Integer integer : arr) {
            System.out.println(integer + " " +"this is the array");
        }

        System.out.println(llist);

        ListIterator<Integer> listIterator = llist.listIterator();

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
    }
}
