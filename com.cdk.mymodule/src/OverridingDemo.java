

//Method Overriding,Run time polymorphism and Dynamic Method Dispatching
class Base1{
    /*final*/ public void display()
    {
        System.out.println("show() in Base1");
    }

    //some other methods also can exist here
}

class Derived1 extends Base1{

    public void display()//same method declaration
    {
        System.out.println("show() in Derived1");
    }

    //some other methods also can exist here
}

class Derived2 extends Base1{
    public void display()
    {
        System.out.println("show() in Derived2");
    }

    //some other methods also can exist here
}

public class OverridingDemo {
    public static void main(String[] args) {
        Base1 obj = new Base1();
        obj.display();//show() in Base1 gets invoked

        //Derived1 obj1 = new Base();
        //error, derived class reference cannot refer to base class object

        obj = new Derived1();
        obj.display();//show() in Derived1 gets invoked

        obj = new Derived2();
        obj.display();//show() in Derived2 gets invoked
    }

}
