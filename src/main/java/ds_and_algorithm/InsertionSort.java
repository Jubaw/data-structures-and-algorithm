package ds_and_algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(arr);

       for (int i : arr){
           System.out.println(i);
       }

    }


    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than temp,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
