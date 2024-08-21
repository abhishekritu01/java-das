package opps.abstraction;



interface A {

    int x = 10;                   // public static final int x = 10;
    int age = 21;                 // public static final int age = 21;
    void show();

    void config();
}

class B implements A {

    public void show() {
        System.out.println("Show");
    }

    public void config() {
        System.out.println("Config");
    }

}

public class DemoInterface {

    public static void main(String[] args) {

        A obj = new B();
        obj.show();
        obj.config();
    }

}
