package OOPSWork.Inheritance;

public class test {
    static void main() {
        Vehicle v = new TwoWheeler();
        TwoWheeler t = new TwoWheeler();

        t.start();
        t.stop();
        v.start();
        v.stop();
    }
}
