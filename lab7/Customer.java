package lab7;
import java.util.Scanner;
public class Customer {
    public int id;
    public String name;
    public char gender;

    Customer(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your ID:");
        id=input.nextInt();
        System.out.println("Enter your Name:");
        name=input.nextLine();
        input.nextLine();
        System.out.println("Enter your gender [M/F]");
        gender=input.nextLine().charAt(0);
    }
    //getters
    int getid(){
        return id;
    }
    String getname(){
        return name;
    }
    char getgender(){
        return gender;
    }
    @Override
    public String toString(){
        String output=String.format("%s (%s)",name,id);
        return output;
    }

}
