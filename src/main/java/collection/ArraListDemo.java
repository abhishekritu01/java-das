package collection;

import java.util.*;


class Student {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';

    }
}

public class ArraListDemo {


    public static void arraylist() {
        List<Integer> list = new ArrayList<Integer>();
        System.out.println(list.size());
        list.add(10);
        list.add(80);
        list.add(30);
        list.add(40);

//        for(int item : list){
//                System.out.print(item + " ");
//        }
        System.out.println(list.size());
        System.out.println(list.reversed());
        System.out.println(list.stream().max(Integer::compare).get());
        System.out.println(list.stream().min(Integer::compare).get());
    }


    public static void setArrayList() {

//        Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<>();       // in tree set get sorted value
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(20);
        nums.add(30);
        System.out.println(nums.size());
        System.out.println(nums);

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }

    public static void arrayMap() {

        Map<String, Integer> student = new HashMap<>();

        // key should be unique
        student.put("Rahul", 10);
        student.put("aman", 20);
        student.put("ankit", 40);
        student.put("abhi", 50);
        System.out.println(student.size());
        System.out.println(student);

        System.out.println(student.get("Rahul"));
        System.out.println(student.keySet());

        for (String key : student.keySet()) {
            System.out.println(key + " " + student.get(key));
        }


    }

    public static void arraysorting() {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(80);
        list.add(30);
        list.add(40);
        System.out.println(list);

        Collections.sort(list, comp);

        System.out.println(list);


    }

    public static void studentSort() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Rahul"));
        students.add(new Student(30, "Aman"));
        students.add(new Student(20, "Ankit"));
        students.add(new Student(40, "Abhi"));
        System.out.println(students);


    }

    public static void main(String[] args) {
//        arraylist();
//        setArrayList();
//        arrayMap();
//        arraysorting();
        studentSort();
    }

}
