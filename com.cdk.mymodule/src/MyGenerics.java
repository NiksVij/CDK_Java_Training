/**
 * Created by vijayn on 7/8/2017.
 */
public class MyGenerics {
    public static void main(String[] a){
        H<String> h = new H<>("tHis z H");
        T<String> t = new T<String>("This z T");
        MyGeneric<T,H> myGeneric = new MyGeneric<>(t,h);
        System.out.println(myGeneric);
    }


}
class H<P>{
    P h ;
    H(P s){
        h=s;
    }

    @Override
    public String toString() {
        return h.toString();
    }
}
class T<P>{
    P t ;
    T(P s){
        t=s;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}
class MyGeneric<T,H>{
    T t;
    H h;
    MyGeneric(T t ,H h){
        this.t = t;
        this.h = h;
    }

    @Override
    public String toString() {
        return new String("T: " +t +" H:"+h);
    }
}