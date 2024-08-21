package opps.intrface;

interface A {

    // Declaring the variables - by default public final and static
    int x = 10;
    String name = "Rahul";

    // Declaring the methods
    void show();

    void config();

    void display();
}

interface AB {
    void draw();
}

interface C extends A, AB {
    void print();

    void music();
}

// Class B implements interface C
class B implements C {
    public void show() {
        System.out.println("in Show");
    }

    public void config() {
        System.out.println("in Config");
    }

    public void display() {
        System.out.println("in Display");
    }

    public void draw() {
        System.out.println("in Draw");
    }

    public void print() {
        System.out.println("in Print");
    }

    public void music() {
        System.out.println("in Music");
    }
}


public class Demo {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
        obj.display();
        obj.draw();
        obj.print();
        obj.music();
    }
}
