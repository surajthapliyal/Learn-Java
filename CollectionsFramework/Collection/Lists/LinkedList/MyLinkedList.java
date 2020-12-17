package CollectionsFramework.Collection.Lists.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

//  or  import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(11);
        ll.add(123);
        ll.add(234);
        System.out.println(ll);
        ll.remove(3);   //index
        ll.add(54);
        System.out.println(ll);

        System.out.println(ll.get(2));
        
        ll.set(0, 23);
        System.out.println(ll);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(3);
        al.add(243);

        ll.addAll(al);
        System.out.println(ll);

        ll.removeAll(al);
        System.out.println(ll);

        System.out.println(ll.size());

        System.out.println(ll.contains(123));

        System.out.println(ll.isEmpty());

        Integer arr[] = new Integer[ll.size()];
        arr = ll.toArray(arr);
        // or
        ll.toArray(arr);
        for(int each : arr) System.out.print(each + " ");

        System.out.println();
        ll.clear();
        System.out.println(ll);
    }
}
