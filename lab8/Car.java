package lab8;

public class Car extends Vehicle {
    
    public Car(){
        super(brand, year);
    }

    public void Honk(){
        System.out.println("Honking the horn of the " + getyear() + " " + getbrand() + " car.");
    }
    
}
