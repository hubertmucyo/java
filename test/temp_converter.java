package test;
import java.util.*;
public class temp_converter {
    public static void main(String args[]){
        Scanner get=new Scanner(System.in);
        float cel,fahr;
        System.out.println("Enter the temperature in celsius");
        cel=get.nextFloat();
        fahr=(cel*9/5)+32;
        System.out.println("The fahreinheit is: "+fahr);

    }
}
