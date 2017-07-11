/**
 * Created by vijayn on 7/6/2017.
 */
public class MyStackOverflow {
    static int i =0;
    public static void main (String args[]){
        System.out.println(++i);
        try{main(args);}
        catch (StackOverflowError e){
            System.out.println("\nyello");
           // e.printStackTrace();
        }
    }
}
