public class ThreadDeadLock {
/*
*
*
* ALWAYS LOCK IN SAME ORDER
*
*
* */
    String str1 = "Java";
    String str2 = "UNIX";
    static int i = 0;

    Thread trd1 = new Thread("My Thread 1"){
        public void run(){
            int itr = 0;
            while(true){
                System.out.println("thread 1: iteration no."+itr);
                itr++;
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str1 + str2+" "+i);
                        i++;
                    }
                }

            }
        }
    };

    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            int itr = 0;
            while(true)//infinite while loop
            {
                System.out.println("thread 2: iteration no."+itr);
                itr++;
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str2 + str1+" "+i);
                        i++;
                    }
                }
            }
        }
    };

    public static void main(String a[]) throws Exception{
        ThreadDeadLock mdl = new ThreadDeadLock();
        mdl.trd1.start();
        mdl.trd2.start();

        System.out.println("Exiting main thread");
    }
}
