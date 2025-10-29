package OOPSWork;

public class Driver {
    static int minAge=18;
    int age=19;
    public boolean isEligible(){
        return this.age>minAge;
    }
    //why we make our main static so JVM don't have to make obj to access it.
    static void main() {
        //this make a obj of Car (new Car())and put the address in thar(referrence)
        //new keyword is used to make a copy/instance of a class
        Car thar=new Car();
        Car swift =new Car("blue");
        //thar.addFuel(6);
        thar.start();
        thar.driving();
        thar.start().driving();
        System.out.println( thar.currentFuel);
        Driver d=new Driver();
        if(d.isEligible()){
            System.out.println("good to go");
        }
        else{
            System.out.println("still a kid");
        }
        System.out.println(swift.color);
    }
}
