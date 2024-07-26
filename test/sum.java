package test;
import java.util.Scanner;
public class sum {
    public static void main(String [] args){
        Scanner subject=new Scanner(System.in);
        float[] subj =new float[5];
        float sum=0;
        System.out.println("Enter marks of 5 subjects:\n");
        for(int i=0;i<5;i++){
            subj[i]=subject.nextFloat();
            sum=sum+subj[i];
        }
        
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+sum/5);

    }
}
