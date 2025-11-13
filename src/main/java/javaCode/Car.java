package javaCode;

public class Car {
    final int CONS_VALUE = 9;
    String name;
    int price;
    int wheels;

    public Car(String name, int price, int wheels) {
        this.name = name;
        this.price = price;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", wheels=" + wheels +
                '}';
    }

    static void main() {
        Car c = new Car("swift", 1200, 4);
        System.out.println(c);

    }
}
