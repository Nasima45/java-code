package MultiThreading;

public class SEcTask  extends Thread{
    public void run()
    {
        for(int i=0;i<100;i++){
            System.out.printf("%d:& ",i);
        }
        System.out.println("Name of the &Thread: "+ Thread.currentThread().getName());
    }
}
