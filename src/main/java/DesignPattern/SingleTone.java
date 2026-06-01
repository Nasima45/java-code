package DesignPattern;

class SingleToneDemo {
    private static SingleToneDemo instance;

    private SingleToneDemo() {
        System.out.println("singletone demo");
    }

    public static SingleToneDemo getInstance() {
        if (instance == null) {
            instance = new SingleToneDemo();
        }
        return instance;
    }
}

public class SingleTone {

    public static void main() {
        SingleToneDemo s1 = SingleToneDemo.getInstance();

    }
}
