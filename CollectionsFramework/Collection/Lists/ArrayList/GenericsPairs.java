package CollectionsFramework.Collection.Lists.ArrayList;
class Pair<X,Y>{
    X x;
    Y y;
    Pair(X x,Y y){
        this.x = x;
        this.y = y;
    }
    public void getDescription() {
        System.out.println(x+" and "+y);
    }
}
public class GenericsPairs {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Hello", 1);
        Pair<Boolean, Character> p2 = new Pair<>(true, 'c');
        p1.getDescription();
        p2.getDescription();
    }
}
