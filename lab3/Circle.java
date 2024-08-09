package lab3;
import java.util.*;
public class Circle {
    double radius;
    String color;

    Circle(){
        radius=1.0;
        color="red";
    }

    Circle(double rad){
        this();
        radius=rad;
    }

    Circle(String colour){
        this();
        color=colour;
    }

    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        Circle c1=new Circle();
        System.out.println("The Circle rad is "+c1.radius+" and color is: "+c1.color);

        System.out.println("ENter the radius of the circle: ");
        double radi=get.nextDouble();
        Circle c2=new Circle(radi);
        System.out.println("The Circle rad is "+c2.radius+" and color is: "+c2.color);

        System.out.println("Enter the color of the circle:");
        String colo=get.next();
        Circle c3=new Circle(colo);
        System.out.println("The Circle rad is "+c3.radius+" and color is: "+c3.color);


    }
}
