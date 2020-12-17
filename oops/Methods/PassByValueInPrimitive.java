package oops.Methods;

public class PassByValueInPrimitive {
    static class Dog{
        int legs;
    }
    public static void main(String[] args) {
        Dog c=new Dog();
        c.legs=4;
        Dog d=new Dog();        
        d.legs=3;
        swap(c,d);          //swapping will swap reff only.
        System.out.println(c.legs+" "+d.legs);

        Dog e=new Dog();
        e.legs=4;
        changeValue(e);     //passing one object and updating it tin fuc will change the
                            // main obj value also.
        System.out.println(e.legs);
    }
    static void swap(Dog a,Dog b){
        Dog temp=a;
        a=b;
        b=temp;
    }
    static void changeValue(Dog e)
    {
        e.legs=6;
    }
}