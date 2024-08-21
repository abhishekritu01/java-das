package opps.inheritance;

class A {

    A() {
        super();
        System.out.println("A's constructor");
    }

    A(int a){
        super();
//        this();
        System.out.println("parameterized constructor" + " :  "  +  a);
    }
}

class B extends A {

    B() {
//        super();
        System.out.println("B's constructor");
    }

    B(int a){
//        super();
        this();
        System.out.println("parameterized constructor" + " :  "  +  a);
    }
}

public class ThisSuper {

    public static void main(String[] args) {
        B b = new B(5);


    }
}
