package dsa.cyclicsort;

import java.util.ArrayList;
import java.util.List;

class MissingAllNo {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currentIndex = nums[i] - 1;
            if (nums[i] != nums[currentIndex]) {
                swap(nums, i, currentIndex);
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                list.add(index + 1);
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

        MissingAllNo obj = new MissingAllNo();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingNumbers = obj.findDisappearedNumbers(nums);
        System.out.println(missingNumbers);


    }

}