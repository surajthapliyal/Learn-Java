package oops.Inheritance;

public class MainClass {
    public static void main(String[] args) {
        
        //implicit or upcasting:
        // Teacher t=new Teacher();
        // Person p = t;          
        





        //explicit or downcasting :
        // Person p= new Person();
        // Teacher t =(Teacher) p; 
        //but this will throw exception error while compiling 
        //as person is not a teacher actually(but may be).

        //so to resolve this :
        // Teacher t1 = new Teacher();
        // Person p = t1;
        // Teacher t =(Teacher) p;
        //this will not throw exception error while compiling
        //as t1 is teacher ans then initialized to p
        //so p is teacher and then downcasted to t(teacher)
        





        //to check the class of an instance:
        // Teacher t1=new Teacher();
        // Singer s1=new Singer();
        // Person p=t1;
        // System.out.println(p instanceof Teacher);
        // System.out.println(t1 instanceof Teacher);        //true as it is.
        // System.out.println(s1 instanceof Singer);         //true as it is.
        // System.out.println(t1 instanceof Person);         //true as it is(ultimately).
        
        




        
        // Person p=new Person();        
        // p.name="Unknown";
        // System.out.println("Person's name is "+p.name);
        // p.eat();
        // p.walk();
        // Teacher t=new Teacher();
        // t.name="Mr. Harry";
        // System.out.println("Teacher's name is " + t.name);
        // t.eat();
        // t.walk();
        // t.teach();
        // Singer s=new Singer();
        // s.name="Zayn Malik.";
        // System.out.println("Singer's name is " + s.name);
        // s.eat();
        // s.walk();
        // s.sing();
    }
}