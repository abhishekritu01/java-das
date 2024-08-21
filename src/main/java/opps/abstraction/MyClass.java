package opps.abstraction;


abstract public class MyClass {


    // Concrete method
    public void callMe() {
        System.out.println("This is callMe method");
    }

    // Abstract method
    // we not to create object of abstract class
    abstract public void launchMe() ;


    abstract public void launchRocket(String name, int speed);

}


