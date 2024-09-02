package dsa.sorting;

import java.util.Arrays;

public class CyclicSort {


    public static void cyclicSort(int[] arr) {
       int i = 0;
       while(i<arr.length){
           int currectIndex = arr[i] -1;
           if(arr[i] != arr[currectIndex]){
               swap(arr,i,currectIndex);
           }else{
               i++;
           }
       }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
