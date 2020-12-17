package CollectionsFramework.Maps;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Pen pen1 = new Pen(10,"Blue");
        Pen pen2 = new Pen(10, "Blue");

        System.out.println();

        System.out.println(pen1);   // prints object Id
        System.out.println(pen2);   // prints object Id
        
        // if we do pen1=pen2; the it will show true as now both the object will point the same reference 
        // because of which the object id for both the object will now be same.
        System.out.println();

        // System.out.println(pen1.equals(pen2));  //false , as the object id for both are not same(both dont refer same object)
        System.out.println(pen1==pen2);     //same as above.
        // now after overriding the equals method of class in out class Pen :
        System.out.println(pen1.equals(pen2));// this will print true as the content in both object is same 
                                                //as per our overridden method implementation of equal .





        // but if we are making set of Pens then the duplicacy will not be allowed 
        // even though we have overridden equals method.

        // but this will still consider both as diff object 
        // ans store both of them in the set differently.
        Set<Pen> pens = new HashSet<>();
        pens.add(pen1);
        pens.add(pen2);
        
        

        // so the question arises,
        // if not equals then who is else is also checking the uniqueness of the objects(in basis of object ID)??

        // this is because hashCode , which is the method of object class:
        // so to remove this uniqueness of sets we have to override the hashCode method for Pen object
       
       
        System.out.println(pens); // if hashCode is not overridden then this will print the Object ID 
        // for both the object added to it(as internally both are not referring to same object)
        // ans if we do override the hashCode method for that Class with our own logic to consider the 
        // object as similar if their data is same then this will store only one object ID as both the 
        // object will be having same id and Set does not support duplicacy.
        
    }
}
class Pen{
    int price;      
    String color;
    Pen(int price , String color){
        this.price = price;
        this.color = color;
    }

    // now if we want to override the equals method of Object class :
    @Override
    public boolean equals(Object obj){
        // casting obj to Pen type so that we can check:
        Pen that = (Pen) obj;
        boolean isEqual = this.price == that.price && this.color.contentEquals(that.color);
        return isEqual;
    }
    @Override
    public int hashCode(){
        // our hashCode logic to remove uniqueness:
        return this.price + this.color.hashCode();
        //                              |
        //                              |----->returns the hashCode for this string 
    }
}
