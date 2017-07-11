
class Base
{
    private int d;
    protected int i,j;
    float z;
    //protected members can be accessed within the class and
    //sub class, and in current package

    Base()
    {
        System.out.println("This is Base() Constructor");
    }

    public static void met()
    {
        System.out.println(" met() in Base");
    }
}


class Derived extends Base
{
    int k;

    Derived(int x,int y, int z)
    {
        System.out.println("Derived(int x,int y, int z) constructor");
        i = x;
        j = y;
        //d = 10; //Compiler error, since d is private in Base class
        k = z;
    }

    public static void met()
    {
        System.out.println(" met in Derived");
    }

    public void show()
    {
        System.out.println(" values of k is:"+k);

        met();
    }
}


public class SimpleInheritance{
    public static void main(String args[])
    {
        Base obj = new Derived(10,20,30);

        System.out.println(obj.i);
        //obj.show();
        obj.met();//Base class methods can be called from Derived class objects
    }
}
