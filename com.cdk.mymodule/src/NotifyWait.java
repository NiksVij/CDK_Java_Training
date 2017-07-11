public class NotifyWait {
    static Calculator b;

    public static void main(String[] args) {
        b = new Calculator();
        b.start();

        synchronized (b) {
            try {
                System.out.println("A:waiting for b thread to complete...");
                b.wait();
                //Thread.sleep(0,10);
                System.out.println("after wait()....");
            } catch (Exception e) {
                System.out.println("Interrupted Exception:" + e.getMessage());
                e.printStackTrace();
            }
            System.out.println("Total is:" + b.total);
        }
    }
}


class Calculator extends Thread {
    int total;
    public void run() {
        try {
            System.out.println("in run() method of Child thread");
            synchronized (NotifyWait.b) {
                for (int i = 0; i < 10; i++) {
                    total += i;
                    Thread.sleep(0,5);
                }
                NotifyWait.b.notify();
                System.out.println("notify() invoked from Child thread");
            }
        } catch (Exception et) {
            System.out.println(et);
        }
        System.out.println("Exiting Calculator");
    }
}
