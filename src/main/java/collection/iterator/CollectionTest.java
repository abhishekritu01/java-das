package collection.iterator;

import java.util.Iterator;

public class CollectionTest {

    public static void main(String[] args) {

        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        for (int item : list) {
            System.out.println(item);
        }

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

    }
}
