package dsa.sorting;

import java.util.Arrays;

public class QuickSort {


    public static void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        if (low < end) {
            quickSort(arr, low, end);
        }

        if (high > start) {
            quickSort(arr, start, high);

        }
    }


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(java.util.Arrays.toString(arr));
        Arrays.sort(arr);
    }
}
