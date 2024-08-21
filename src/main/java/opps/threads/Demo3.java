package opps.threads;

class AAA implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread A: i = " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class BBB implements Runnable{
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread B: j = " + j);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Demo3 {

    public static void main(String[] args) {
        Runnable threadA = new AAA();
        Runnable threadB = new BBB();

        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);

        t1.start();
        t2.start();



    }
}
