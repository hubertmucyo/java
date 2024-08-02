package lab2;
import java.util.Scanner;
public class name {
    static String First_name,middle_name,last_name;

    static void input(){
        Scanner enter=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        First_name=enter.nextLine();
        System.out.println("Enter your middle name: ");
        middle_name=enter.nextLine();
        System.out.println("Enter your last name: ");
        last_name=enter.nextLine();
    }

    static void display(){
        System.out.println("Your name is: "+First_name+" "+middle_name+" "+last_name);
    }
    public static void main(String[] args) {
        input();
        display();
    }
}
