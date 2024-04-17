package ds_and_algorithm;

import java.util.LinkedList;

public class LinkedLists01 {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
/*      linkedList.push();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        */


        //Linked-List as a QUEUE
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        linkedList.add(4,"E"); //Insertion
        linkedList.remove("E"); //Deletion
        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList);

        //Peeking at tail or end
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        //Adding to HEAD or TAIL
        linkedList.addFirst("O");
        linkedList.addLast("G");

        System.out.println(linkedList);






    }
}
