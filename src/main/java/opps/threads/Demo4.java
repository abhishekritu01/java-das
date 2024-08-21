package opps.threads;

public class Demo4 {

    public static void main(String[] args) {

        Runnable obj1 = () ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("From Thread A: i = " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };


        Runnable obj2 = () ->
        {
            for (int j = 1; j <= 5; j++) {
                System.out.println("From Thread B: j = " + j);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}



