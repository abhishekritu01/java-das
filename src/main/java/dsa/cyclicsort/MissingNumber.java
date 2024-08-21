package dsa.cyclicsort;

public class MissingNumber {

    public static int missing(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currentIndex = nums[i];
            if (currentIndex < nums.length && nums[i] != nums[currentIndex]) {
                swap(nums, i, currentIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        // If all numbers are in the correct positions, return the length of the array
        return nums.length;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {

        int[] arr = {4, 2, 0, 1};
        int missingNumber = missing(arr);
        System.out.println(missingNumber);
    }
}
