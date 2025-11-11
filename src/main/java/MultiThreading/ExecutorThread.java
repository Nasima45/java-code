package MultiThreading;

public class ExecutorThread implements Runnable {
    private  final char targetChar;
    public ExecutorThread(char targetChar){
        this.targetChar=targetChar;
    }

    @Override
    public void run() {
        for(int i=0;i<=20;i++){
            System.out.println(i+":"+targetChar);
        }
        System.out.println("task complete for : "+ Thread.currentThread().getName());
    }
}
