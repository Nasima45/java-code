package MultiThreading;

import java.util.concurrent.*;

class Fetchname implements Callable<String> {
    private final String name;

    Fetchname(String name) {
        this.name = name;
    }


    @Override
    public String call() throws Exception {
        System.out.println("fetching name from server " + name);
        Thread.sleep(4000);
        return name + " you are cute";
    }
}

public class MultiExecutorThreadTest {
    static void main() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Fetchname task1 = new Fetchname("kuhu");
        Fetchname task2 = new Fetchname("naj");
        Fetchname task3 = new Fetchname("paro");
        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        System.out.println("full name : " + name1.get());
        System.out.println("full name : " + name2.get());
        System.out.println("full name : " + name3.get());

        Callable<Integer> task = () -> {
            System.out.println("print sum");
            Thread.sleep(5000);
            return 3 + 3;
        };

        Future<Integer> result = service.submit(task);
        System.out.println("Result: " + result.get());
        for (int i = 1; i <= 5; i++) {
            int tskId = i;
            service.submit(() -> {
                System.out.println(tskId + " is running by " + Thread.currentThread().getName());
            });

        }
        service.shutdown();
    }
}
