package opps;

class OuterClass {
    int a;
    public void show() {
        System.out.println("In show");
    }

    class InnerClass {
        public void display() {
            System.out.println("In display");
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.show();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
    }
}
