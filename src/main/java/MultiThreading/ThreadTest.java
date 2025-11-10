package MultiThreading;

public class ThreadTest {
    static void main() {
        try{
        FirstTask t=new FirstTask();
        SEcTask t1=new SEcTask();
        System.out.println("first thread");
        t.start();
        System.out.println("sec thread");
        //this will stop the main execution unitl my t work is done
        t.join();
        t1.start();}
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
