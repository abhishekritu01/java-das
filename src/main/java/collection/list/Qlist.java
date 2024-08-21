package collection.list;

import java.util.*;

public class Qlist {


    public static void stack(){
        //lifo last in first out
        //push, pop, peek, empty
        Stack<Integer> stack = new Stack<>(); // for lifo queue use stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
    }


    public static void quee() {
        //fifo first in first out
        //add, offer, remove, poll, element, peek
        Queue<Integer> qlist = new LinkedList<>();  // for fifo queue use linkedlist
        qlist.offer(1);
        qlist.offer(2);
        qlist.offer(3);
        qlist.offer(4);

        System.out.println(qlist.peek());
        System.out.println(qlist.poll());
        System.out.println(qlist.peek());
        System.out.println(qlist.remove());
        System.out.println(qlist.isEmpty());

    }

    public static void arraydeque() {
        Deque<Integer> deque = new ArrayDeque<>();  // for lifo queue use arraydeque
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerFirst(4);

        System.out.println(deque);   // [4, 3, 2, 1]
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.peekFirst());



    }


    public static void priorityqueue() {
        //priority queue
        //add, offer, remove, poll, element, peek
        Queue<Integer> pqueue = new PriorityQueue<>(); // for priority queue use priorityqueue
        pqueue.offer(1);
        pqueue.offer(2);
        pqueue.offer(3);
        pqueue.offer(4);

        System.out.println(pqueue.peek());
        System.out.println(pqueue.poll());
        System.out.println(pqueue.peek());
        System.out.println(pqueue.remove());
        System.out.println(pqueue.isEmpty());
    }

    public static void main(String[] args) {
//        quee();
//        stack();
//        arraydeque();
        priorityqueue();


    }
}
