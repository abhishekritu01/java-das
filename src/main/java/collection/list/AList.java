package collection.list;

import java.util.ArrayList;
import java.util.List;

public class AList {

    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>();

        alist.add(1);
        alist.add(2);
        alist.add(3);


//        for(int item : alist) {
//            System.out.print(item);
//        }

        System.out.println(alist);

        alist.set(1, 100);
//        System.out.print(alist);

        ArrayList<Integer> alist2 = new ArrayList<>(alist);
        alist2.add(4);
        alist2.add(5);
        alist2.add(6);
        alist2.addAll(alist);


        alist2.add(1, 200);
        alist2.remove(2);
        System.out.println(alist2 + " " + alist2.size() + "this is the size of the arraylist");
        System.out.println(alist2.indexOf(100));
        System.out.println(alist2.lastIndexOf(100));
        System.out.println(alist2.contains(100));
        System.out.println(alist2.isEmpty());
        System.out.println(alist2.get(1));
        System.out.println(alist2.subList(1, 3));
        System.out.println(alist2.remove(1));


        // `sublist last index is exclusive`
        // sublist is a view of the original list and any changes made to the sublist will reflect in the original list
        //is just a reference to the original list
        List<Integer> alist3 = alist2.subList(1, 3);
        alist3.add(0, 100000);
        System.out.println(alist3 + "this is the sublist");
        System.out.println(alist2 + "this is the original list");


    }
}
