package lab9;
import java.util.*;
public class Converter {
    int converter(double n1){
        return (int) n1;
    }
    double converter(int n1){
        return (double)n1;
    }
    int converter(String n1){
        return Integer.valueOf(n1);
    }


    public static void main(String[] args) {
        Converter cv=new Converter();
        Scanner get=new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        double dec=get.nextDouble();
        System.out.println("Converted into int: "+cv.converter(dec));

        System.out.println("Enter an integer:");
        int integer=get.nextInt();
        System.out.println("Converted into double:"+cv.converter(integer));

        System.out.println("Enter a number in string:");
        String str1=get.next();
        System.out.println("Converted into int: "+cv.converter(str1));
    }
    
}
