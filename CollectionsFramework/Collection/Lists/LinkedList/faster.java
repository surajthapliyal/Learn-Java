package CollectionsFramework.Collection.Lists.LinkedList;

import java.util.*;

public class faster {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();

        timeDifference(al);
        timeDifference(ll);
    }
    static void timeDifference(List<Integer> list){
        long start = System.currentTimeMillis();
        // inserting takes more time in array rather than linkedList.
        for(int i=0;i<100000;i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();

        System.out.println(list.getClass().getName() + " = "+(end -start));
    }
}
