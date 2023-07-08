package collection.queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {

    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();

        queue.add("Almas");
        queue.add("James");
        queue.add("Ben");
        queue.offer("Sean");
        queue.offer("Jesica");
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue.remove()); // on 6 element throw Exception
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll()); //without Exception
        System.out.println(queue.peek());

        System.out.println(queue);




    }
}
