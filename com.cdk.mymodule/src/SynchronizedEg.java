class Table{

    void printTable(int n) throws Exception{
        System.out.println("entered printTable() "+n);
        Thread.sleep(2000);

        synchronized(this)
        {//synchronized block
            System.out.println("synchronized block started "+n);
            for(int i=1;i<=10;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
            System.out.println("synchronized block ended "+n);
        }

        System.out.println("exiting from printTable()"+n);
        Thread.sleep(2000);

    }//end of the method
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){

        try
        {
            t.printTable(5);
        }
        catch(Exception e){}
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        try{
            t.printTable(100);
        }
        catch(Exception e){}
    }
}


public class SynchronizedEg{
    public static void main(String args[])
    {
        Table obj = new Table();//only one object
        //Table obj1 = new Table();
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
} 