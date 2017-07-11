/*
 * Java Thread pool represents a group of worker threads that are waiting for the
 * job and reuse many times.

In case of thread pool, a group of fixed size threads are created.
A thread from the thread pool is pulled out and assigned
a job by the service provider. After completion of the job, thread is contained
in the thread pool again.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WorkerThread implements Runnable {
    private String message;
    public WorkerThread(String s){
        this.message=s;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()
                +" (Start) message = "+message);
        processmessage();
        //call processmessage method that sleeps the thread for 2 seconds

        System.out.println(Thread.currentThread().getName()
                +" (End) "+message);//prints thread name
    }
    private void processmessage(){
        try
        {  Thread.sleep(2000);  }
        catch (InterruptedException e) { e.printStackTrace(); }
    }
}

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        //creating a pool of 5 threads

        for (int i = 0; i < 20; i++) {
            Runnable worker = new WorkerThread("" + i);
            es.execute(worker);//calling execute method of ExecutorService
        }

       /*
        * Two different methods are provided. The shutdown() method will allow previously submitted tasks to execute
        * before terminating, while the shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks.
        * Upon termination, an executor has no tasks actively executing, no tasks awaiting execution, and no new tasks can be submitted.
        */

        es.shutdown();
        System.out.println("shutdown() invoked");
        while (!es.isTerminated());

        System.out.println("Finished all threads");
    }
}
