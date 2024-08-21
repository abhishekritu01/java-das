package dsa.cyclicsort;

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currentIndex = nums[i] - 1;
            if (nums[i] != nums[currentIndex]) {
                swap(nums, i, currentIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index + 1};
            }
        }
        return new int[] {-1, -1};
        
    }

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        SetMismatch obj = new SetMismatch();
        int[] nums = {1, 2, 2, 4};
        int[] errorNumbers = obj.findErrorNums(nums);
        System.out.println(errorNumbers[0] + " " + errorNumbers[1]);
    }
}