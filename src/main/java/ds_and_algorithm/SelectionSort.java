package ds_and_algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {


        int[] arrray = {8, 7, 9, 2, 3, 1, 5, 4, 6};


        selectionSort(arrray);


        for (int i : arrray) {
            System.out.print(i);
        }
        System.out.println();



    }

    //int[] arrray = {8, 7, 9, 2, 3, 1, 5, 4, 6};


    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }






    /*for (int i = 0; i < arrray.length - 1; i++) {
            for (int j = i + 1; j < arrray.length - 1; j++) {
                int temp;
                int min;
                if (arrray[i] > arrray [j]){
                    temp = arrray[i];
                    min = arrray[j];
                    arrray[i] = min;
                    arrray[j] = temp;
                }
                System.out.println(Arrays.toString(arrray));
            }
        }*/
}