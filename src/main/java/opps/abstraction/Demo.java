package opps.abstraction;


abstract class Car {

    public abstract void drive();

    public abstract void fly();


    public  void palayMusic() {
        System.out.println("Playing Music");
    }
}


class Audi extends Car {             // concrete class -> means we have to implement all the abstract methods of parent class

    @Override
    public void drive() {
        System.out.println("Audi is driving");
    }

    @Override
    public void fly() {
        System.out.println("Audi is flying");
    }
}



// we can't create object of abstract class
// abstract class can have abstract methods and non-abstract methods
// abstract class can have constructor


public class Demo {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.drive();
        audi.palayMusic();
        audi.fly();

    }
}
