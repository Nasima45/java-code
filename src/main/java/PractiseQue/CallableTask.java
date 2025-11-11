package PractiseQue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class CallableExample implements Callable<Integer> {
    private int num;

    CallableExample(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Running sum operation by: " + Thread.currentThread().getName());
        if (num == 1) {
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

public class CallableTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2); // 2 threads in pool

        // --- Create a list to store results of multiple sum tasks ---
        List<Future<Integer>> sumResult = new ArrayList<>();

        // --- Submit 10 tasks that calculate the sum from 1 to i ---
        for (int i = 1; i <= 10; i++) {
            CallableExample task2 = new CallableExample(i);
            sumResult.add(service.submit(task2));
        }

        // --- Get the results one by one ---
        for (Future<Integer> result : sumResult) {
            System.out.println("Sum result: " + result.get());
        }

        // --- Another callable task to calculate factorial ---
        Callable<Integer> task1 = () -> {
            System.out.println("Running factorial operation by: " + Thread.currentThread().getName());
            int fact = 1;
            for (int i = 1; i <= 5; i++) {
                fact = fact * i;
            }
            return fact;
        };

        Future<Integer> result = service.submit(task1);
        System.out.println("Factorial of 5: " + result.get());

        service.shutdown();
    }
}
