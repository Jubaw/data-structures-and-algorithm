package ds_and_algorithm;

import java.util.ArrayList;


public class BinarySearch {
    public static void main(String[] args) {

        int[] array = new int[100];
        int target = 45;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
        //int index = Arrays.binarySearch(array,target);
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println("Element found at " + index);
        }


    }

    private static int binarySearch(int[] array, int target) {

        int low = 0; //sets the 0, starting of the array index
        int high = array.length - 1; // -1 because of index.

        while (low <= high) { // As long as the low is smaller than high, it will continue
            int middle = low + (high - low); // 2; //formula to find middle in each iteration.
            int value = array[middle]; //the middle index value of the array is given to a new variable.

            System.out.println("Middle: " + value); //types the Middle in each iteratior.

            if (value < target) low = middle + 1; // if value ( middle ) is smaller than target, low is set to middle + 1.
                // Basically taking secong side of halving as the low.Goes back to the start of the loop and continues with low being middle +1.

            else if (value > target) high = middle - 1; //if value is higher than target, it sets high as middle -1. Taking the first side of the halving.
            else return middle; //If all conditions fail, it means we narrowed down our scope and in the middle, is our target.

        }
        return -1; //target not found

    }

}

