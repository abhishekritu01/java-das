package opps.up_and_down_casting;

class A {
    public void show1() {
        System.out.println(" in A show");
    }

}

class B extends A {
    public void show2() {
        System.out.println(" in B show");

    }
}


public class Demo {

    public static void main(String[] args) {

        double d = 100.04;
        int l = (int) d; // explicit type casting required
        System.out.println("this is called type casting " + l);


        // Upcasting
        A obj = new B();
        obj.show1();

        // Downcasting
        B obj1 = (B) obj;
        obj1.show2();    // we can not call show2() method using obj reference


    }
}
