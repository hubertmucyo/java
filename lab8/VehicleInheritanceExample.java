package lab8;
import java.util.Scanner;
public class VehicleInheritanceExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the brand of the vehicle");
        String brandc=sc.nextLine();
        System.out.println("Enter the year of the vehicle");
        int yearc=sc.nextInt();
        Vehicle cr=new Vehicle(brandc, yearc);
        Car c1=new Car();
        c1.start();
        c1.accelerate();
        c1.Honk();
        c1.stop();

        sc.nextLine();

        System.out.println("Enter the brand of the vehicle");
        String brandm=sc.nextLine();
        System.out.println("Enter the year of the vehicle");
        int yearm=sc.nextInt();
        Vehicle bike=new Vehicle(brandm, yearm);
        Motorcyle m1=new Motorcyle();
        m1.start();
        m1.accelerate();
        m1.wheelie();
        m1.stop();
        sc.close();
    }

}
