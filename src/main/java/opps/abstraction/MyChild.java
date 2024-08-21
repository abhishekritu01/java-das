package opps.abstraction;

public class MyChild extends MyClass{


    @Override
    public void launchMe() {
        System.out.println("This is launchMe method");
    }

    @Override
    public void launchRocket(String name, int speed) {
        System.out.println("This is launchRocket method with name: " + name + " and speed: " + speed);
    }


    public static void main(String[] args) {

        MyClass myClass = new MyChild();  // This is called upcasting
        myClass.callMe();
        myClass.launchMe();
        myClass.launchRocket("Falcon", 1000);


        MyChild myChild = new MyChild();  //
        myChild.callMe();
        myChild.launchMe();
        myChild.launchRocket("Falcon2", 2000);
    }
}
