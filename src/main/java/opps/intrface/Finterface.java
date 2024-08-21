package opps.intrface;

@FunctionalInterface
interface X {
    void show();
//    void display();
}

//class BB implements X {
//    public void show() {
//        System.out.println(" in show");
//    }
//}


public class Finterface {

    public static void main(String[] args) {

        X obj = new X() {
            public void show() {
                System.out.println(" in show");
            }
        };

        obj.show();

    }
}
