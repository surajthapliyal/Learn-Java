package CollectionsFramework.Collection.Sets;

import java.util.*;
// uses specific order to store

public class linkedHashSet {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();
        System.out.println(s.add("apple"));
        System.out.println(s.add("banana"));
        System.out.println(s.add("grapes"));
        System.out.println(s.add("grapes"));// give false for duplicates as set not allow to add duplicates.
        System.out.println(s);// duplicates wont print and also not in sorted order

        s.remove("apple");
        System.out.println(s);

        System.out.println(s.size());

        System.out.println(s.contains("banana"));

        System.out.println(s.isEmpty());

        s.clear();
        System.out.println(s);

        System.out.println(s.isEmpty());
    }
}
