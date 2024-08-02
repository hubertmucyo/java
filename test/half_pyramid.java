package test;

import java.util.Scanner;

public class half_pyramid {

    public static void main(String[] args) {
        Scanner let=new Scanner(System.in);
        int rows;
        System.out.println("Enter number of rows: ");
        rows=let.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
