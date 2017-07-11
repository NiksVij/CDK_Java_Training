class TableA{

    //prints multiplication table of a given int
    static synchronized void printTable(int n){
        System.out.println("----------starting multiples of:"+n);
        for(int i=1;i<=10;i++){
            System.out.println("multiple of:"+n +" is "+n*i);
            try{
                Thread.sleep(500);
            }catch(Exception e){ System.out.println(e);}
        }
        System.out.println("----------ending multiples of:"+n);
    }
}

class MyThread1A extends Thread{
    public void run(){
        TableA.printTable(1);
    }
}

class MyThread2A extends Thread{
    public void run(){
        TableA.printTable(10);
    }
}


public class SynchornizedMet{
    public static void main(String t[]){
        MyThread1A t1=new MyThread1A();
        MyThread2A t2=new MyThread2A();


        t1.start();
//t1.start(); //throws IllegalThreadStateException , since the thread has already been started
        t2.start();


//Thread can also be started, using anonymous object
//new MyThread1A().start();

    }
}  


/*Assignment 1
 * create one thread with extends Thread
 * create another thread with implements Runnable
 * Assignment 2
 * Re write above example code, using only one Thread class
*/