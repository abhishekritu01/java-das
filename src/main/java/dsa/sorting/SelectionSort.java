package dsa.sorting;

/*
2 selection sort -> find the maximum element and placed at correct index
    // select a array and placed at rigth place
    //best case - O(N2)
    //worst case - O(N2)
    // stable - not
    // perform at small place


    }
* */

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, i, last);
            swap(arr, maxIndex, last);
        }
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxIndex(int[] arr, int i, int last) {
        int max = 0;
        for (int j = 0; j <= last; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }
}
