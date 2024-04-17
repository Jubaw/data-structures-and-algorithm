package ds_and_algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
       /*
        Queue = FIFO data structure. First-In First-Out| (ex. A line of people)
        A collection designed for holding elements prior to processing Linear data structure
        add = enqueue, offer ()
        remove = dequeue, poll()
        */

        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Steve");
        queue.offer("Harold"); //[Karen, Steve, Harold]


        queue.poll(); //- Steve, Harold //RETURNS null if empty, removes FiFo object otherwise
        queue.poll(); //- Hardol        //RETURNS null if empty, removes FiFo object otherwise

        System.out.println(queue.peek()); // FiFo Karen // RETURNS null if is empty
        // System.out.println(queue.element());//FiFo Karen // THROWS "NoSuchElementException" exception if is empty


        /*It is an interface extending Collection class,
        so Queue’s have access to some methods of Collection
        class such as ; size(),empty(),equals()*/

        System.out.println("isEmpty: "+ queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
    }
}
