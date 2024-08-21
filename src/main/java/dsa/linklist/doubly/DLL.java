package dsa.linklist.doubly;

public class DLL {

    Node head;

    public void insertFirst(int value) {
        Node node = new Node(value);

        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "-->");
            node = node.next;
        }
        System.out.println();
    }

    public void displayReverse() {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        while (node != null) {
            System.out.print(node.value + "-->");
            node = node.prev;
        }
        System.out.println();
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    private class Node {

        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
