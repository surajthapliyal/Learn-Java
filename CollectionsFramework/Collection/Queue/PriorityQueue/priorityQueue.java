package CollectionsFramework.Collection.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(11);
        pq.add(223);
        pq.add(300);
        pq.add(34);

        System.out.println(pq);
        
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
    }
}
