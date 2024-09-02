package dsa.sorting;

public class MergeInPlace {

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSortInPlace(arr, start, mid);
            mergeSortInPlace(arr, mid + 1, end);
            mergeInPlace(arr, start, mid, end);
        }
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = start;
        int[] tempArr = new int[arr.length];

        // Merge the two halves into the temporary array
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                tempArr[k++] = arr[i++];
            } else {
                tempArr[k++] = arr[j++];
            }
        }

        // Copy the remaining elements of left subarray, if any
        while (i <= mid) {
            tempArr[k++] = arr[i++];
        }

        // Copy the remaining elements of right subarray, if any
        while (j <= end) {
            tempArr[k++] = arr[j++];
        }

        // Copy the sorted subarray into the original array
        for (i = start; i <= end; i++) {
            arr[i] = tempArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
