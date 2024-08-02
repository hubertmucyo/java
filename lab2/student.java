package lab2;
import java.util.Scanner;
public class student {
    static String name;
    static int age;
    static String id;

    static void input(){
        Scanner get=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=get.nextLine();
        System.out.println("Enter your age: ");
        age=get.nextInt();
        System.out.println("Enter your id or passport: ");
        id=get.next();
    }
    static void print(){
        System.out.println("Your name is "+name+ " age is "+age+" and identity is "+id);
    }

    public static void main(String [] args){
        input();
        print();
    }
}
