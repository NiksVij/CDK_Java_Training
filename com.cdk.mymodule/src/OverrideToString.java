/**
 * Created by vijayn on 7/6/2017.
 */
public class OverrideToString {
    public static void main(String args[]){
        MyA myA = new MyA();
        myA.fun();
    }
}
class MyA{
    public void fun(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Hey yo! Its Overridden toString";
    }

}