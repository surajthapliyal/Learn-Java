package CollectionsFramework.Collection.Lists.Vectors_and_Stacks;

import java.util.Vector;

public class vectors {
    public static void main(String[] args) {
        Vector<Integer> v= new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println(v);
        v.remove(1);
        v.set(1, 12);
        System.out.println(v);
        System.out.println(v.get(1));
        System.out.println(v);
    }
}
