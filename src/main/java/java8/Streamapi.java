package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamapi {

    // stream api is used to process collections of objects in a functional way

    public static void demo1() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

//
//        nums.forEach(n -> System.out.print(n + " "));
//        nums.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));

    }

    public static void demo2(){
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);

        s1.forEach(n -> System.out.print(n + " "));     // once stream is used, it can't be used again
//        s1.max(Integer::compare).ifPresent(System.out::println);



    }


    public static void main(String[] args) {
        demo2();

    }
}
