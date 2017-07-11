
class NewThread1 implements Runnable{
    String name; //name of Thread
    Thread t;

    NewThread1(String threadname){
        name=threadname;
        t = new Thread(this, name);
        System.out.println("New thread:"+t);
        t.start();
    }

    public void run(){
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie){
            System.out.println(name+" Interrupted");
        }

        System.out.println(name+" Exiting");
    }
}


public class JoinCheck {
    public static void main(String args[])
    {
        NewThread1 nt1=new NewThread1("Alpha");
        NewThread1 nt2;
        NewThread1 nt3;
        NewThread1 nt4;
        //start the threads
        nt2=new NewThread1("Beta");
        nt3=new NewThread1("Teta");
        nt4=new NewThread1("Gama");

        threads_status(nt1,nt2,nt3,nt4);
        try
        {
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
            nt4.t.join();


            System.out.println("completed all four threads");
        }catch(Exception ien)
        {
            System.out.println("main thread Interrupted");
        }
        threads_status(nt1,nt2,nt3,nt4);
        System.out.println("main thread Exiting");
    }

    private static void threads_status(NewThread1 nta,NewThread1 ntb,NewThread1 ntc
            ,NewThread1 ntd)
    {
        System.out.println("Thread Alpha Alive?"+nta.t.isAlive());
        System.out.println("Thread Beta Alive?"+ntb.t.isAlive());
        System.out.println("Thread Teta Alive?"+ntc.t.isAlive());
        System.out.println("Thread Gama Alive?"+ntd.t.isAlive());
    }
}

