package oops.Inheritance;

public class Teacher extends Person {
    
    public void teach(){
        System.out.println(name + " is teaching.");
    }
    public void walk(){ //walk method of person(parent class) overrides
        System.out.println("Teacher "+ name + " is walking.");
    }
    public void eat(){ // eat method of person(parent class) overrides
        System.out.println("Teacher " + name + " is eating.");
    }

}