package MultiThreading;

public class ThreadState extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("currrent state of our thread: " + getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
