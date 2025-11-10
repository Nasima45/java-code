package MultiThreading;

public class HelloThread extends Thread{
    private final int threadNum;

    public HelloThread(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("HELLLO FROM THREAD : "+ threadNum+"," + " Thread Name: "+ Thread.currentThread().getName());
        }
    }
}
