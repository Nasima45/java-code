package OOPSWork.Abstraction;

public class Test {
    static void main() {
        Circle c = new Circle(5);
        c.calculateArea();
        Square s = new Square(9);
        s.calculateArea();
        s.color();
        Shape s1=new Circle(7);
        s1.color();

    }
}
