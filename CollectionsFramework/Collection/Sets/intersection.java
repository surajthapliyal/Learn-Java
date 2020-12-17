package CollectionsFramework.Collection.Sets;
import java.util.*;
public class intersection {
    public static void main(String[] args) {
        Set<Integer> x = new HashSet<>();
        x.add(23);
        x.add(1);
        x.add(6);
        System.out.println(x);

        Set<Integer> y = new HashSet<>();
        y.add(3);
        y.add(1);
        y.add(16);
        System.out.println(y);

        x.retainAll(y);
        System.out.println(x);
    }
}
