package dsa.linklist.doubly;

public class Main {

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.insertFirst(40);
        dll.insertFirst(50);
        dll.display();
        dll.displayReverse();
        dll.insertLast(60);
    }
}
