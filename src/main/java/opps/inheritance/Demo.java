package opps.inheritance;


public class Demo {

    public static void main(String[] args) {

//        Calculator c = new Calculator();
//        AdvanceCalculator c = new AdvanceCalculator();
        VeryAdvanceCalculator c = new VeryAdvanceCalculator();
        System.out.println(c.add(5, 3));
        System.out.println(c.sub(5, 3));
        System.out.println(c.mul(5, 3));
        System.out.println(c.div(5, 3));
        System.out.println(c.power(5, 3));
        System.out.println(c.squareRoot(5));


    }
}
