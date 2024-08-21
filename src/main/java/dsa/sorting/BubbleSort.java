package dsa.sorting;

import java.util.Arrays;

/**  1.
 * Largest Element: After the first pass, the largest element is moved to its correct position (end of the array).
 * Subsequent Passes: Repeat the process for the remaining unsorted elements. With each pass, the next largest element is placed in its correct position, moving towards the end of the array.
 * Steps in Bubble Sort:
 * */

public class BubbleSort {

    public static void main(String [] args){

        int [] arr = {3,1,4,5,6};
        bubblesort(arr);
        System.out.print(Arrays.toString(arr));

    }

    private static void bubblesort(int[] arr) {
        int len = arr.length;
        boolean swapped;

        for(int i=0; i<len; i++){
            swapped = false;
            for(int j=1;j<len-i;i++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }


}
