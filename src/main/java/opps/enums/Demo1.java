package opps.enums;


enum Laptop {
    DELL, HP, MACBOOK
}

public class Demo1 {

    public static void main(String[] args) {
        Laptop l = Laptop.MACBOOK;

        switch (l) {
            case DELL:
                System.out.println(" this is DELL");
                break;
            case HP:
                System.out.println(" this is HP");
                break;
            case MACBOOK:
                System.out.println(" this is MACBOOK");
                break;
        }




    }
}
