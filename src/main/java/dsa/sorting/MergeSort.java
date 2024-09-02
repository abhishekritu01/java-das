package dsa.sorting;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] sortedArr = mergeSort(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
        System.out.println("Time complexity is O(nlogn) and space complexity is O(n)");

        //time complexity is O(nlogn) and space complexity is O(n)

    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] newArray = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;


        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                newArray[k] = first[i];
                i++;
            } else {
                newArray[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            newArray[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            newArray[k] = second[j];
            j++;
            k++;
        }

        return newArray;
    }
}
