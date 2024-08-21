package opps.lamdaexpression;


// lamda expression - it is a way to implement functional interface in a more concise way
// Functional interface - interface with only one abstract method

@FunctionalInterface
interface Abc {
    void show(int i);
}

@FunctionalInterface
interface Pqr {
    int add(int i, int j);
}

public class Demo {

    // lamda expression - it is a way to implement functional interface in a more concise way

    public static void main(String[] args) {

        Abc obj = (i) -> System.out.println("I am the best" + i);   // lamda expression
        obj.show(5);

        Pqr obj1 = (i, j) -> i + j;     // lamda expression for add method of Pqr interface which takes two arguments

        int result = obj1.add(5, 5);
        System.out.println(result);

    }
}
