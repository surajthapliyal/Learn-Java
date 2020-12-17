package ComparatorsAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClassForComparator {
    public static void main(String[] args) {
        List<SimpleLaptop> laps = new ArrayList<>();
        laps.add(new SimpleLaptop("Dell", 16, 800));
        laps.add(new SimpleLaptop("Apple", 8, 1200));
        laps.add(new SimpleLaptop("Acer", 12, 700));

        // so to sort this type of un editable class's objects we have to use
        //  Collection.sort(listName,Comparator);  override and implement compare(t o1, t o2); method:
        Collections.sort(laps,new Comparator<SimpleLaptop>(){

			@Override
			public int compare(SimpleLaptop o1, SimpleLaptop o2) {
                // sorting on the basis of price:
                return o1.getPrice() - o2.getPrice();
			}
            
        });

        for(SimpleLaptop l : laps){
            System.out.println(l);
        }
    }
}
