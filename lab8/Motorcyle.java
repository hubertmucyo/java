package lab8;

public class Motorcyle extends Vehicle {

    public Motorcyle(){
        super(brand, year);
    }

    public void wheelie(){
        System.out.println("Popping a wheelie on the " + getyear() + " " + getbrand() + " motorcycle.");
    }
    
}