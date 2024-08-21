package opps.encapsulation;


class Human {

    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class Demo {

    public static void main(String[] args) {
        Human human = new Human();
//         human.age = 10; // This will give error as age is private
        human.setAge(10);
        System.out.println(human.getAge());

        human.setName("John");
        System.out.println(human.getName());

    }
}
