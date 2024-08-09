package lab2;
import java.util.Scanner;
import java.util.*;
public class Date {
    static int day;
    static int month;
    static int year;
    static String nmonth;

    static void input(){
        Scanner enter=new Scanner(System.in);
        System.out.println("enter the day, month and year");
        day=enter.nextInt();
        month=enter.nextInt();
        year=enter.nextInt();
    }

    static void print(){
        System.out.println("The date is: "+day+" "+month+" "+year);
    }

    static void printformat1(){
        System.out.println("First format: "+day+"."+month+"."+year);
    }

    /**
     * 
     */
    static void printformat2(){
        
            switch (month) {
                case 1:
                    nmonth="JAnuary";
                    break;
                case 2:
                    nmonth="February";
                    break;
                case 3:
                    nmonth="March";
                    break;
                case 4:
                    nmonth="April";
                    break;
                case 5:
                    nmonth="MAy";
                    break;
                case 6:
                    nmonth="June";
                    break;
                case 7:
                    nmonth="July";
                    break;
                case 8:
                    nmonth="August";
                    break;
                case 9:
                    nmonth="September";
                    break;
                case 10:
                    nmonth="October";
                    break;
                case 11:
                    nmonth="November";
                    break;
                case 12:
                    nmonth="December";
                    break;
                default:
                    break;
            }
            String Nday;
            switch(day%10){
                case 1:
                    Nday=(day/10==1)?"st":"th";
                    break;
                case 2:
                    Nday=(day/10==2)?"nd":"th";
                    break;
                case 3:
                    Nday=(day/10==3)?"rd":"th";
                    break;
                default:
                    Nday="th";
                    break;
            }
        
        System.out.println("The date is: "+day+Nday+" "+nmonth+" "+year);
        
        }
    public static void main(String[] args){
        input();
        int choice;
        Scanner let=new Scanner(System.in);
        do{
            System.out.println("Enter the format of your choice: \n"+"1. Default\n"+"2. Format1\n"+"3. Format2\n"+"4.Exit");
            choice=let.nextInt();
            if(choice==1){
                print();
            }
            else if(choice==2){
                printformat1();
            }
            else if(choice==3){
                printformat2();
            }
            else if(choice==4){
                System.exit(0);
            }
            else{
                System.out.println("Invalid input!");
                System.out.println("ENter again!");
            }
        }while(choice!=4);   

    }
}
