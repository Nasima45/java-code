package PractiseQue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MultiThread implements  Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class MultiThreadPractice {
    static void main() {
       try(ExecutorService service= Executors.newFixedThreadPool(3)){
           MultiThread task1=new MultiThread();
           MultiThread task2=new MultiThread();
           MultiThread task3=new MultiThread();
           MultiThread task4=new MultiThread();
           service.submit(task1);
           service.submit(task2);
           service.submit(task3);
           service.submit(task4);
           service.shutdown();
        }

    }
}
