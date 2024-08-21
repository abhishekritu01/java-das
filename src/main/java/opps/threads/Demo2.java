package opps.threads;


class AA extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("From Thread A: i = " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class BB extends Thread {
    public void run() {
        for (int j = 1; j <= 20; j++) {
            System.out.println("From Thread B: j = " + j);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {

        AA threadA = new AA();
        BB threadB = new BB();

        // thread priority
        System.out.println("Thread A priority:================== " + threadA.getPriority());   // 5
//        threadB.setPriority(3);
        threadB.setPriority(Thread.MAX_PRIORITY);
        // constant
        //1 MIN_PRIORITY
        //5 NORM_PRIORITY
        //10 MAX_PRIORITY


        threadA.start();
        threadB.start();

    }
}
