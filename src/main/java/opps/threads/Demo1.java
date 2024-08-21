package opps.threads;


class A extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("From Thread A: i = " + i);
        }
        System.out.println("Exit from A");
    }
}


class B extends Thread {
    public void run() {
        for (int j = 1; j <= 20; j++) {
            System.out.println("From Thread B: j = " + j);
        }
        System.out.println("Exit from B");
    }
}

public class Demo1 {

    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        threadA.start();
        threadB.start();
    }
}
