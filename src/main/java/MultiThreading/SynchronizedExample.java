package MultiThreading;

public class SynchronizedExample {
    static void main() {
        Counter co=new Counter();
        SynchronizedThread s1=new SynchronizedThread(co);
        SynchronizedThread s2=new SynchronizedThread(co);
        try{


        s1.start();
        s2.start();
        s1.join();
        s2.join();
            System.out.println("final count:"+ co.getCount());
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }


    }
}
