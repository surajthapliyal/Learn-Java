
package ComparatorsAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClassForComparable {
    public static void main(String[] args) {
        List<ComparableLaptop> laps = new ArrayList<>();
        laps.add(new ComparableLaptop("Dell",16,800));
        laps.add(new ComparableLaptop("Apple",8,1200));
        laps.add(new ComparableLaptop("Acer",12,700));

        // but if we want to sort this collection??
        // Collections.sort(list name); can sort list of integers ,strings etc.
        // but how to sort list of objects??

        // for this we have to make laptop class Comparable and implement compareTo method to it.
        Collections.sort(laps);
        // System.out.println(laps);
        // or
        for(ComparableLaptop l : laps){
            System.out.println(l);
        }
    }
}
