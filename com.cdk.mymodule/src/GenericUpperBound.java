class A2{

}

class B2 extends A2 implements C2{

}

interface C2{}

//Note: For interface implementations also extends is used
class Wrapper2< T extends A2 & C2>
//class Wrapper2< T extends A2>
{
    T ot;
    Wrapper2(T ot)
    {
        this.ot = ot;
    }

    void print()
    {
        System.out.println(ot);
    }
}

public class GenericUpperBound {
    public static void main(String[] args) {
        B2 ob = new B2();

        //Compiler error, since C2 does not extends A2
        //Wrapper2<C2> wbo = new Wrapper2<C2>(ob);

        Wrapper2<B2> wbo = new Wrapper2<B2>(ob);

        wbo.print();


    }
}
