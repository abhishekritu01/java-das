package dsa.cyclicsort;

public class DuplicateNumber {

    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int currentIndex = arr[i] - 1;
                if (arr[i] != arr[currentIndex]) {
                    swap(arr, i, currentIndex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 3, 2};
        System.out.println(findDuplicate(arr));
    }
}
