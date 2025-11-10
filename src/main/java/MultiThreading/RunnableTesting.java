package MultiThreading;

public class RunnableTesting {
    static void main() {
        PrintTask P1 = new PrintTask('&');
        PrintTask P2 = new PrintTask('#');

        Thread t1 = new Thread(P1);
        Thread t2 = new Thread(P2);
        t1.start();
        t2.start();
    }
}
