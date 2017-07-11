package com.cdk.myp;

class IabcdImpl implements Iabcd{

    IabcdImpl(){
        System.out.println("IabcdImpl() constructor...");
    }

    public void met1()
    {
        //Iabcd.QRS = 68;
        System.out.println("met1() implemented in SimpleInterface "+Iabcd.QRS);
    }

    public int met2()
    {
        System.out.println("met2() implemented in SimpleInterface");
        return 0;
    }

    //any other methods can be defined here
}

public class SimpleInterface{
    //provide body for methods in Iabcd interface
    public static void main(String[] args) {

        //Iabcd ot = new Iabcd();

        Iabcd obj = new IabcdImpl();
        //Iabcd obj1 = new Ght(); //compiler error

        System.out.println(Iabcd.QRS);

        //Iabcd.QRS = 30; //compiler error

        obj.met1();
    }
}
