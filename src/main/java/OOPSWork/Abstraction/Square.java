package OOPSWork.Abstraction;

public class Square extends Shape {
    int side;
    Square(int side){
        this.side=side;
    }

    @Override
    public void calculateArea() {
        System.out.println("area of square :" + side * side);
    }
    public void color(){
        super.color();
        System.out.println("orange");
    }
}
