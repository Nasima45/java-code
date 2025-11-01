package Exception;

import java.util.Scanner;

public class AgeChecker {
    int age;

    public AgeChecker(int age) {
        this.age = age;
    }

    public void validateAge() throws InvalidAgeException{
        if(this.age<=18){
            throw  new InvalidAgeException("you are too young babe....");
        }
        System.out.println("welcome sweetheart");
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        AgeChecker a=new AgeChecker(age);
        try{
            a.validateAge();
        }
        catch(InvalidAgeException e){
            System.out.println("Message: "+ e.getMessage());
        }
    }
}
