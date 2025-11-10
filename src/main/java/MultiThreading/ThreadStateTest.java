package MultiThreading;

public class ThreadStateTest {
    static void main() {
        ThreadState t1 = new ThreadState();
        System.out.println("create the  thread : " + t1.getState());
        try {
            t1.start();
            t1.join();
            System.out.println("finish thread : " + t1.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
