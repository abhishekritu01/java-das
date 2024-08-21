package dsa.sorting;

import java.util.Arrays;

public class MergeSort {

    static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }
        ;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                result[k] = first[i];
                i++;
            } else {
                result[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            result[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            result[k] = second[j];
            j++;
            k++;
        }


        return result;

    }






public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    int[] sortedArr = mergeSort(arr);
    System.out.println("Original Array: " + Arrays.toString(arr));
    System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    System.out.println("Time complexity is O(nlogn) and space complexity is O(n)");

    //time complexity is O(nlogn) and space complexity is O(n)

}
}
