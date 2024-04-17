package ds_and_algorithm;

import java.util.*;

public class PriorityQueues01 {
    public static void main(String[] args) {


    /*
    Priority Queue = A FIFO data structure that serves elements
    with the highest priorities first before elements with lower priority
    */
        //--1st Step Queue<Double> queue = new PriorityQueue<>(); Orders elements ascending (natural order)
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder()); // (Collections.reverseOrder parameter reverses the Q list.

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");
        System.out.println("Queue is : "+ queue);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());



        }










    }

}


