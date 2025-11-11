package PractiseQue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingleThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("running by thread: "+ Thread.currentThread().getName()+ " , " +i );
        }

    }
}

public class SingleThreadPractice {
    static void main() {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            SingleThread task = new SingleThread();
            service.submit(task);
        }

    }
}
