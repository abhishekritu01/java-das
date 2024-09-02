package dsa.linklist.question;

import org.w3c.dom.Node;

public class Main {




    public static void main(String[] args) {
//        LLL  node = new LLL();
//        node.insertFirst(1);
//        node.insertFirst(2);
//        node.insertFirst(2);
//        node.insertFirst(3);
//        node.insertFirst(3);
//        node.insertFirst(4);
//
//
//        node.display();
//        node.removeDuplicate();
//        node.display();

        //2
        LLL node1 = new LLL();
        LLL node2 = new LLL();
        node1.insertFirst(1);
        node1.insertFirst(2);
        node1.insertFirst(3);
        node1.insertFirst(4);
        node1.insertFirst(5);

        node2.insertFirst(1);
        node2.insertFirst(3);
        node2.insertFirst(5);
        node2.insertFirst(7);

        node1.display();
        node2.display();

        LLL ans = LLL.merge(node1, node2);
        ans.display();

    }



}
