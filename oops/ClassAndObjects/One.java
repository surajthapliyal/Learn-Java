package oops.ClassAndObjects;
class cat{
    //class's states:
    boolean hasFur;
    String color,breed;
    int legs,eyes;

    //class's behaviors:
    public void walk(){
        System.out.println("Cat is walking.");
    }
    public void eat(){
        System.out.println("Cat is eating.");
    }
    public void description(){
        System.out.println("My cat has "+legs+" legs and "+eyes+" eyes.");
    }
}
class dog{
    String name,breed;

    public void jump(){
        System.out.println("My dog "+name+" is jumping.");
    }
    public void description(){
        System.out.println("My dog's name is "+name+" and it's breed is "+breed+".");
    }

}
public class One {
    public static void main(String[] args) {
        cat cat1=new cat();
        cat1.eat();
        cat cat2=new cat();
        cat2.walk();
        cat1.legs=4;    cat1.eyes=2;
        cat1.description();
        cat2.legs=3;    cat2.eyes=1;
        cat2.description();

        dog dog1=new dog();
        dog1.name="Bruno";
        dog1.breed="Doberman";
        dog1.jump();
        dog1.description();
    }
}