package dsa.linklist.circular;

public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.size = 0;
    }


    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        }
        tail.next = node;
        node.next = head;
        head = node;
    }

    public void display() {
        Node node = head;
        do {
            System.out.print(node.value + "-->");
            node = node.next;
        } while (node != head);
        System.out.println();
    }

    public void delete(int value) {
        Node temp = head;
        Node prev = null;
        do {
            if (temp.value == value) {
                if (prev == null) {
                    head = temp.next;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                size = size - 1;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
