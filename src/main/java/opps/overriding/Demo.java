package opps.overriding;


class  Calculator{

    //=================== Overridden method
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvCalculator extends Calculator{

    //=================== Overriding method
//    public int add(int n1, int n2){
//        return n1+n2+10;
//    }
}

public class Demo {

    public static void main(String[] args) {
        AdvCalculator advCalculator = new AdvCalculator();
        System.out.println(advCalculator.add(10, 20));
    }
}
