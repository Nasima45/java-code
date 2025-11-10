package MultiThreading;

public class SynchronizedThread extends Thread{
    private Counter counter;

    public SynchronizedThread(Counter counter) {
        this.counter = counter;
    }
    public void run(){
        for(int i=1; i<=10;i++){
            counter.increment();
        }
    }
}
