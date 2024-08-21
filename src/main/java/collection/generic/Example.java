package collection.generic;

public class Example {

    public static void main(String[] args) {

        Box<String> box = new Box<String>("abhishek kumar");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());


        Box<Integer> box1 = new Box<>(555);
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());

    }
}


