package opps;

public class Student {

    // data members or instance variables
    private String name;
    private int age;
    private String address;



    // behavior or methods
    public void study() {
        System.out.println(name + " is studying");
    }

    public void showAll_details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

        System.out.println(this.name+ "========= using this keyword");
    }


    // constructor  - it is a special method which is used to initialize the object
    // 1 . Non-Parameterized constructor
    public Student() {
        System.out.println("Student object is created from constructor");
    }

    // 2. Parameterized constructor
    public Student(String name, int age, String address) {
        System.out.println("Studen name is " + name + " and age is " + age + " and address is " + address  + " from parameterized constructor");
    }


    public Student(double salary){
        System.out.println("Salary is " + salary);
    }


    // method overloading  - same method name with different parameters
    public void showAll_details(String name, int age, String address) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void showAll_details(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    // this keyword - it is used to refer the current object

    public void showAll_details(String name, int age, String address, double salary) {
        System.out.println(this.name + " using this keyword");


    }





    public static void main(String[] args) {

        // creating object of Student class
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;
        student1.address = "New York";
        student1.study();
        student1.showAll_details();

        Student student2 = new Student("abhishek",25,"India");
        student2.name = "Smith";
        student2.age = 22;
        student2.address = "California";
        student2.study();
        student2.showAll_details();
    }




}
