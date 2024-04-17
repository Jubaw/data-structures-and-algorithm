package ds_and_algorithm;

import org.w3c.dom.ls.LSOutput;

public class BubleSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};


        bubbleSort(arr);
        for (int i : arr){
            System.out.println(i);
        }


    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) { //> orders by ASC, < orders by DESC
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }
}
