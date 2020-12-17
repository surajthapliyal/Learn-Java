package CollectionsFramework.Collection.Lists.Vectors_and_Stacks;

import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        System.out.println("on peek "+s.peek());
        System.out.println("pop " +s.pop());
        System.out.println("on peek " +s.peek());
        System.out.println("pop " +s.pop());
        System.out.println(s);
        System.out.println("is empty ? ="+s.empty());
        System.out.println("position of 2  = "+s.search(2));
    }
}
