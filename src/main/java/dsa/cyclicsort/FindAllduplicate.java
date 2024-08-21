package dsa.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindAllduplicate {


    public static List<Integer> findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int currentIndex = arr[i] - 1;
            if (arr[i] != arr[currentIndex]) {
                swap(arr,i,currentIndex);
            }else{
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                list.add(arr[index]);
            }
        }
        return list;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

            int[] arr = {4, 3, 2, 7, 8, 2, 3, 1,7};
            List<Integer> missingNumbers = findDuplicate(arr);
            System.out.println(missingNumbers);
    }

}
