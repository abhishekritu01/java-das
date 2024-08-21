package opps.abstraction;

abstract class Parent {
    public abstract void show();
}

public class Demo2 {

    public static void main(String[] args) {

        Parent obj = new Parent() {        // Anonymous class (class without name)
            @Override
            public void show() {
                System.out.println("Hello");
            }
        };

        obj.show();
    }
}
