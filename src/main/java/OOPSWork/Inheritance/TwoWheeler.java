package OOPSWork.Inheritance;


public class TwoWheeler implements Vehicle {

    @Override
    public void start() {
        System.out.println("start ....");
    }

    @Override
    public void stop() {
        System.out.println("stop....");
    }
}
