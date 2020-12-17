package CollectionsFramework.Collection.Queue.ArrayDeque;

import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(13);
        ad.addFirst(12);
        ad.addLast(14);
        ad.addLast(15);
        System.out.println(ad);
        System.out.println(ad.removeFirst());
        System.out.println(ad.removeLast());
        System.out.println(ad);
        System.out.println(ad.pop());
        ad.push(20);
        System.out.println(ad);
        System.out.println(ad.peek());
    }
}
