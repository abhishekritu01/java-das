package dsa.sorting;

import java.util.Arrays;

public class Insertionsort {

    public static void insertion(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 6, 9, 3};

        insertion(arr);
        System.out.println("Sorted array is: " + Arrays.toString(arr));

    }
}
