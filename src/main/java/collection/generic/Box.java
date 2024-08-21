package collection.generic;

public class Box<T> {


    //    String container;
    //Object class is the parent class of all the java class
    T container;

    public Box(T container) {
        this.container = container;
    }

    public Object getValue() {
        return this.container;
    }
}
