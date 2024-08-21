package opps.abstraction;

class Ab {
    public void show() {
        System.out.println(" X  In show");
    }
}



public class AnonymousInnerClass {

    public static void main(String[] args) {


        Ab obj = new Ab()
        {
            public void show() {
                System.out.println(" Y  In show");
            }
        };
        obj.show();
    }
}


