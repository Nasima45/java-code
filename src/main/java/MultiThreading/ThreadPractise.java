package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPractise {
    static void main() {
        ExecutorService excutorService = Executors.newFixedThreadPool(1);
        excutorService.submit(
                () -> System.out.println("current task1 is running by " + Thread.currentThread().getName()));
        excutorService.submit(()->
                System.out.println("current task1 is running by " +Thread.currentThread().getName()));
        excutorService.shutdown();
    }
}
