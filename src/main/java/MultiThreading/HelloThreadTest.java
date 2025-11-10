package MultiThreading;

public class HelloThreadTest {
    static void main() {
        HelloThread t1=new HelloThread(1);
        HelloThread t2=new HelloThread(2);
        t1.start();
        t2.start();
    }
}
