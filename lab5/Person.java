package lab5;
import java.util.Scanner;
public class Person {
    private int age;
    private float weight;
    private float height;

    Scanner take=new Scanner(System.in);
    //constructor
    Person(int age,float weight,float height){
        this.age=age;
        this.weight=weight;
        this.height=height;
    }

    //setters
    public void setage(){
        System.out.println("Enter your age: ");
        int age=take.nextInt();
        this.age=age;
    }

    public void setweight(){
        System.out.println("Enter your weight: ");
        float weight=take.nextFloat();
        this.weight=weight;
    }

    public void setheight(){
        System.out.println("Enter your height");
        float height=take.nextFloat();
        this.height=height;
    }

    //getters
    public int getage(){
        return age;
    }

    public float getweight(){
        return weight;
    }

    public float getheight(){
        return height;
    }
}
