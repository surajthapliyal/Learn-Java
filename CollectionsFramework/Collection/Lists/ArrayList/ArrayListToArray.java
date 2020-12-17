package CollectionsFramework.Collection.Lists.ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println(a1);
        System.out.println("size of a1 = "+a1.size());

        Integer arr[] = new Integer[a1.size()];
        a1.toArray(arr);
        //or  arr = a1.toArray(arr);
        int sum = 0;
        for(int i : arr) sum+=i;
        System.out.println(sum); 
    }
}
