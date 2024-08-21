package dsa.cyclicsort;

class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currentIndex = nums[i] - 1;
            if (nums[i] > 0 && currentIndex < nums.length && nums[i] != nums[currentIndex]) {
                swap(nums, i, currentIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1; // Return the first missing positive
            }
        }
        // If all numbers are in the correct positions, return the length of the array + 1
        return nums.length + 1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        FirstMissingPositive obj = new FirstMissingPositive();
        int[] nums = {3, 4, -1, 1};
        System.out.println(obj.firstMissingPositive(nums)); // Output should be 2
    }
}
