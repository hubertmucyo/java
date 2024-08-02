package lab2;
import java.util.Scanner;
public class length {
    static float l1;
    static float l2;

    static void input(){
        Scanner get=new Scanner(System.in);
        System.out.println("Enter length 1 and length 2: ");
        l1=get.nextFloat();
        l2=get.nextFloat();
    }

    static float add(float length1, float length2){
        return (length1+length2);
    }

    static void print(){
        System.out.println("The sum of the provided lengths is "+add(l1,l2));
    }

    public static void main(String[] args) {
        input();
        print();
    }

}
