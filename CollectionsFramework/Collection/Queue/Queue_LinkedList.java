package CollectionsFramework.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        System.out.println(queue);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.poll();

        queue.element();

        // add() when quantity is full will give exception while offer() will return false/null.
        // remove() when quantity is empty will give exception while poll() will return false/null.
        // element() when quantity is full will give exception while peek() will return false/null.
    }
}
