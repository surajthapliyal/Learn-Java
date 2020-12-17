package oops.Encapsulation;

public class student {
    private int age;
    private String name;
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {   
        if(age<=18){
            System.out.println("Your age is less to visit this site.");
        } else
        this.age=age;
    }
}