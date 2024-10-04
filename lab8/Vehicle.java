package lab8;
public class Vehicle {
    static String brand;
    static int year;

    public Vehicle(String brand, int year){
        Vehicle.brand=brand;
        Vehicle.year=year;
    }

    /*Getters */
    public String getbrand(){
        return brand;
    }

    public int getyear(){
        return year;
    }

    public void start(){
        System.out.println("Starting the " + year + " " + brand + " vehicle.");
    }
 
    public void stop() {
        System.out.println("Stopping the " + year + " " + brand + " vehicle.");
    }
 
    public void accelerate() {
        System.out.println("Accelerating the " + year + " " + brand + " vehicle.");
    }

}
