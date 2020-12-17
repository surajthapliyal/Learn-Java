package CollectionsFramework.Collection.Lists.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List mix = new ArrayList();
        mix.add("Hello");
        mix.add("World");
        mix.add(1243);
        mix.add('c');
        mix.add(1.242);
        System.out.println(mix);
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        System.out.println(fruits);
        List<Integer> marks = new ArrayList<>();
        marks.add(1);
        marks.add(2);
        marks.add(3);
        System.out.println(marks);

        mix.addAll(marks);
        mix.addAll(fruits);
        System.out.println(mix);

        System.out.println(mix.get(2));
        
        mix.set(2, "oneTwoThree");
        System.out.println(mix.get(2));

        mix.remove("oneTwoThree");
        System.out.println(mix);

        mix.remove(0);
        System.out.println(mix);
    
        System.out.println(mix.size());

        System.out.println(mix.removeAll(marks));
        System.out.println(mix);
    
        marks.clear();
        System.out.println(marks);

        System.out.println(fruits.contains("Mango"));

        System.out.println(marks.isEmpty());

        String strArr[] = new String[fruits.size()];
        fruits.toArray(strArr);
        for(int i=0;i<strArr.length;i++){
            System.out.print(strArr[i]+" ");
        }
        System.out.println();
        for(String each : fruits){
            System.out.print(each+" ");
        }
        System.out.println();
        for(Object each : mix){
            System.out.print(each+" ");
        }
    }
}
