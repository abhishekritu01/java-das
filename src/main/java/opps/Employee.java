package opps;

public class Employee {

    private String name;
    private int age;
    private String degination;
    private double salary;

    //constructor
    public Employee(String name, int age, String degination, double salary) {
        this.name = name;
        this.age = age;
        this.degination = degination;
        this.salary = salary;
    }


    public void show_employee_details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Degination: " + degination);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Abhishek kumar", 25, "Software Engineer", 50000);
        emp1.show_employee_details();
    }
}
