package MultiThreading;

public class TrafficLightThread extends Thread {
    private final TrafficColor color;
    private final Object lock;

    public TrafficLightThread(TrafficColor color, Object lock) {
        this.color = color;
        this.lock = lock;
    }


    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("active  : " + color);
            try {
                Thread.sleep(color.getOnTimeMilliS());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("inactive active : " + color);
        }
    }
}
