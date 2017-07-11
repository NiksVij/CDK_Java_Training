import java.util.concurrent.Callable;

/**
 * Created by vijayn on 7/7/2017.
 */
public class MyRunnable {

    public static void main(String[] a){
        Thread t1 = new Thread(new MyRunnableClass("FIRSTRunnable"));
        t1.start();
        new Thread(new MyRunnableClass("SECONDERunnable")).start();
    }
}
class MyRunnableClass implements Runnable {
    String str;
    MyRunnableClass(String s){
        str = s;
    }
    @Override
    public void run() {
        {
            for (int i = 0; i < str.length(); i++) {
                try {
                    System.out.println(str + " : " + str.charAt(i));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("INTERRUPTED EXCEPTION");
                    break;
                }
            }
        }
    }
}
