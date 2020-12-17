package CollectionsFramework.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        Map<String , Integer> m = new HashMap<>();
        m.put("one", 1);
        m.put("two", 2);
        m.put("three", 3);
        
        m.put("one", 11);		//"one" key's value gets updated.
        
        m.putIfAbsent("one", 12); //will not gets put as the key "one" is present.
        System.out.println(m);
        
        System.out.println(m.get("two"));	//wil give the value of the spevified key.
        System.out.println(m.get("five"));	//will give null as the specified key is not present in the map.
        System.out.println(m.containsKey("one"));
        System.out.println(m.containsKey("five"));
        System.out.println(m.containsValue(11));
        System.out.println(m.containsValue(12));
        
        m.replace("three", 13);
        System.out.println(m);
        m.replace("five", 5);	//as the key is not present so the map will remain as it is.
        System.out.println(m);
        
        //if key is present then return its value otherwise return the defaultvalue(null in this case) : 
        System.out.println(m.getOrDefault("one", null));
        System.out.println(m.getOrDefault("six", null));
        
//        if the key is already associated with the old value given then it will get replaced 
//        with the new Value otherwise not:
          m.replace("one", 11, 111);	
          System.out.println(m);		//will get replaced
          m.replace("one", 12 , 1222);
          System.out.println(m);	//will not gets replaced
          
//          remove pair of k key from the map:
          m.remove("three");
          m.remove("six");	//will do nothing as the key six is not present in the map
          System.out.println(m);
          
//          remove the kay/value pair from the map :
          System.out.println(m.remove("two", 2));	//returns true as the pair is present in the map
          System.out.println(m);
          System.out.println(m.remove("kjdngi", 12421));//returns false as the pair is not present in the map.
          
          
          m.put("one", 1);
          m.put("two", 2);
          m.put("three", 3);
          m.put("four", 4);
          m.put("five", 5);
          System.out.println(m);
          
//          returns the set of all the keys present in the map:
          System.out.println(m.keySet());

//          returns the set of all the values present in the map :
          System.out.println(m.values());
          
          
//          returns the set of all the entry(key/value pairs) present in the map:
//          Set<Entry<String,Integer>> entry = m.entrySet();
//          or
          System.out.println(m.entrySet());
          
          
          
          
          System.out.println("\n\n\n");
//          to loop through in the entries :
          for(Entry<String, Integer> entry : m.entrySet()) {
//        	  multiplying all values with 100:
        	  entry.setValue(entry.getValue() * 100);
        	  System.out.println(entry);
          }
     }
}
