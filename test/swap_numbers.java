//program to swap 2 numbers without using a third variable
package test;
import java.util.Scanner;
public class swap_numbers{

    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=cin.nextInt();
        int num2=cin.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("The numbers are: "+num1+" and "+num2);
    }
}