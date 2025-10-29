package OOPSWork;

public class Car {
    static int noOfCarSold;
//will execute once ,at class load time
    static {
        noOfCarSold = 0;
        System.out.println("we are in static block");
    }
// called at obj creation time 2 obj 2 time call
    {
        noOfCarSold++;
        System.out.println("we are in init block");
    }

    float currentFuel;
    int noOfSeats;
    String color;

    //default constructor
    //each car will have this
    Car() {
        currentFuel = 5;
        noOfSeats = 4;
    }

    //parameterized cpnstructor
    Car(String color) {
        this.color = color;
    }

    public Car start() {
        if (currentFuel <= 0) {
            System.out.println("out of oil");
        } else if (currentFuel < 5) {
            System.out.println("on resrved");

        } else {
            System.out.println("driving started");

        }
        //this helps us to return current obj .
        return this;

    }

    public void driving() {

        currentFuel--;
        System.out.println("driving");
    }

    public void addFuel(float fuel) {
        this.currentFuel = currentFuel + fuel;
    }

    public float checkCurrentFule() {
        return currentFuel;
    }
}
