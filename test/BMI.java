package test;
import java.util.Scanner;
public class BMI{

    private static float weight;
    private static float height;

    private static void prompter(){
        Scanner get=new Scanner(System.in);
        System.out.println("Enter your weight in kilograms: ");
        weight=get.nextFloat();
        System.out.println("Enter your height in meters: ");
        height=get.nextFloat();
    }

    private static float calculator(){
        float bmi;
        bmi=weight/(height*height);
        return bmi;
    }

    private static void display(){
        System.out.println("BMI VALUE IS");
        if (calculator()<18.5){
            System.out.println("Underweight");
        }
        else if (calculator()>18.5 && calculator()<=24.9){
            System.out.println("Normal");
        }
        else if (calculator()>=25 && calculator()<=29.9){
            System.out.println("Overweight");
        }
        else if (calculator()>30){
            System.out.println("Obese");
        }
        else{
            System.out.println("Invalid input!");
            System.out.println("Try again");
        }
    }
    public static void main(String [] args){
        prompter();
        display();

    }
}