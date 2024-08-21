package dsa.recursion;

public class Nprint {

    public static void printValu(int n) {

        if (n == 0) {
            return;
        }
        printValu(n - 1);
        System.out.println(n);
//        printValu(n - 1);


    }

    public static void main(String[] args) {
        printValu(5);

    }
}
