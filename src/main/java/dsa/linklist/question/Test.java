package dsa.linklist.question;


public class Test {

    public static void main(String[] args) {
        Practice p = new Practice();
        p.insertFirst(10);
        p.insertFirst(20);
        p.insertFirst(30);
        p.insertFirst(40);
        p.insertFirst(50);

        p.display();
        p.insertLast(100);
        System.out.println();
        p.display();


    }


}
