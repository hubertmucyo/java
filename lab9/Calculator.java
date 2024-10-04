package lab9;
import java.util.Scanner;
public class Calculator {
    
    int add(int num1,int num2){
        return num1+num2;
    }

    int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    int add(int[]num1,int index){
        int sum=0;
        for(int i=0;i<=index;i++){
            sum=sum+i;
        }
        return sum;
    }

    public static void main (String [] args){
        Calculator calc=new Calculator();
        Scanner taker = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=taker.nextInt();
        int b=taker.nextInt();
        int c=taker.nextInt();
        if(a==0){
            System.out.println("The first number is zero!");
            System.out.println("The sum is: "+calc.add(b,c));
        }
        else if(b==0){
            System.out.println("The second number is zero!");
            System.out.println("The sum is: "+calc.add(a, b));
        }
        else if(c==0){
            System.out.println("The third number is zero!");    
            System.out.println("The sum is:"+calc.add(a,b));
        }
        else{
            System.out.println("The sum is: "+calc.add(a, b, c));
        }

        System.out.println("Enter the number of elements in an integer:");
        int idx=taker.nextInt();

        System.out.println("Enter the numbers of the array:");
        int [] arr=new int[idx];
        for(int i=0;i<idx;i++){
            arr[i]=taker.nextInt();
        }
        System.out.println("The sum of the array is :"+calc.add(arr, idx));



    }
}
