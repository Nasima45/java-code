package OOPSWork.Abstraction;

public class Circle  extends Shape{
    float radius;
    Circle(float radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("area of circle: " + 3.14 *radius* radius);
    }
    public void color(){
        System.out.println("pink");
    }
}
