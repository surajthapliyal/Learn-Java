package oops.ClassAndObjects;
class task
{
    int length,width,height;
    long volume;
    public void set_length(int l)
    {
        length=l;
    }
    public void set_width(int w)
    {
        width=w;
    }
    public void set_height(int h)
    {
        height=h;
    }
    public long volume()
    {
    volume=length*width*height;
    return volume;
    }
}
public class classGFG {
    public static void main(String[] args) {
        task t1=new task();
        t1.set_height(778);
        t1.set_length(887);
        t1.set_width(384);
        long vol = t1.volume();
        System.out.println(vol);
    }
}