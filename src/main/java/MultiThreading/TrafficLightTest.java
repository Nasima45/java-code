package MultiThreading;

public class TrafficLightTest {
    static void main() throws InterruptedException {
        Object lock = new Object();
        TrafficLightThread red = new TrafficLightThread(TrafficColor.RED, lock);
        TrafficLightThread green = new TrafficLightThread(TrafficColor.GREEN, lock);
        TrafficLightThread Yellow = new TrafficLightThread(TrafficColor.YELLOW, lock);
        red.start();
        green.start();
        Yellow.start();

    }

}
