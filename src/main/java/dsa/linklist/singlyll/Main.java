package dsa.linklist.singlyll;

public class Main {
    public static void main(String[] args) {

        LL ll = new LL();
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.insertFirst(6);
        ll.insertFirst(7);
        ll.insertFirst(8);
        ll.insertLat(200);

        ll.insert(200,3);


        ll.display();

        System.out.println( ll.deleteFirst());
        ll.display();
        System.out.println( ll.deleteLast());
        ll.display();
        System.out.println( ll.delete(3));
        ll.display();





    }
}
