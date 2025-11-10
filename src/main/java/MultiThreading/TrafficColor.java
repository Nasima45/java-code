package MultiThreading;

public enum TrafficColor {
    RED(3000), GREEN(7000) ,YELLOW(2000);
    private final int onTimeMilliS;

    public int getOnTimeMilliS() {
        return onTimeMilliS;
    }

    TrafficColor(int inTimeMilliS) {
        this.onTimeMilliS = inTimeMilliS;
    }
}
