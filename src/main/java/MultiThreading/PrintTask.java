package MultiThreading;

public class PrintTask implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<23;i++){
            System.out.printf("%d , %c " , i,targetChar);
        }
    }

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    private final char targetChar;

}
