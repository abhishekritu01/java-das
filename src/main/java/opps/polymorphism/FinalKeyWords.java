package opps.polymorphism;



// we can not inherit final class
//final class Parent {};
//class N extends Child {};


// we can not override final method

class Parent {
    public final void show() {
        System.out.println(" in Parent show");
    }
}


class Child extends Parent {

    // we can not override final method
//    public void show() {
//
//    }
}
public class FinalKeyWords {

    // final keyword is used  with variable, method and class
    // final variable is constant
    // final method can not be overridden
    // final class can not be inherited

    final int MAX = 100;
//    Max =200; // error   we can not change the value of final variable

    public final void show() {
        System.out.println(" in show");
    }

    public static void main(String[] args) {
        FinalKeyWords obj = new FinalKeyWords();
        obj.show();
    }


}
