package test;
import java.util.Scanner; 
public class user_info {
   
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name=sc.nextLine();
        int age;
        System.out.println("ENter your age: ");
        age=sc.nextInt();
        String address;
        System.out.println("Enter your address: ");
        address=sc.nextLine();
        float salary;
        System.out.println("Enter your salary: ");
        salary=sc.nextFloat();
        String gender;
        gender=sc.nextLine();

        System.out.println("USER INFORMATION\n"+"--------------------------------------");
        System.out.println("NAME    : "+name);
        System.out.println("ADDRESS : "+address);
        System.out.println("AGE     :"+age);
        System.out.println("SALARY  : "+salary);
        System.out.println("GENDER  : "+gender+"-------------------------------------------");

    }
}
