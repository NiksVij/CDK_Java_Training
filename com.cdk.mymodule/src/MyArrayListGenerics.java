import java.util.ArrayList;
import java.util.List;

/**
 * Created by vijayn on 7/11/2017.
 */
public class MyArrayListGenerics {

    public static void main(String[] ars){
        ArrayList<A3> a3s = new ArrayList<A3>();
        a3s.add(new B3("hey yo!","yo yo!"));
        a3s.add(new A3("halo!"));
        System.out.println(a3s.get(0).toString());
        System.out.println(a3s.get(1).toString());
    }
}
class A3 {
    String a;
    A3(String s){
        a=s;
    }
    @Override
    public String toString() {
        return a;
    }
}
class B3 extends A3{
    String B;
    public B3(String s,String b) {
        super(s);
        B = b;
    }

    @Override
    public String toString() {
        return a+B;
    }
}