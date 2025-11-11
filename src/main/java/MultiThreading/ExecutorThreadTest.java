package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThreadTest {
    static void main() {
        ExecutorService service=Executors.newSingleThreadExecutor();
        ExecutorThread task=new ExecutorThread('*');
        service.submit(task);
        service.shutdown();

    }
}
