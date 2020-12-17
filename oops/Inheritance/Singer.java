package oops.Inheritance;

public class Singer extends Person {
    
    public void sing(){
        System.out.println(name + " is singing.");
    }
    public void walk(){  //walk method of person(parent class) overrides
        System.out.println("Singer " + name + " is walking.");
    }
    public void eat(){
        System.out.println("Singer " + name + " is eating.");
    }
}