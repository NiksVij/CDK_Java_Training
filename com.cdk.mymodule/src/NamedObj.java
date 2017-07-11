interface InnerClass1{

    public void met1();
    /*{
        System.out.println("met1() in InnerClass1");
    }*/
}

public class NamedObj {
    static void met2(InnerClass1 ico){
        ico.met1();
    }
    public static void main(String args[])
    {
        InnerClass1 obj = () -> {
            /*super.met1();*/
            System.out.println("met1() in Anonymous class");
        };

        obj.met1();

        met2(new InnerClass1() {
            @Override
            public void met1() {
                System.out.println("class as a param");
            }
        });
    }
}