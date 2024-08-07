package lab2;
import java.util.Scanner;
public class Date {
    static int day;
    static int month;
    static int year;

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

    static void printformat2(){
        String mois;
            switch (month) {
                case 1:
                    mois="JAnuary";
                    break;
                case 2:
                    mois="February";
                    break;
                case 3:
                    mois="March";
                    break;
                case 4:
                    mois="April";
                    break;
                case 5:
                    mois="MAy";
                    break;
                case 6:
                    mois="June";
                    break;
                case 7:
                    mois="July";
                    break;
                case 8:
                    mois="August";
                    break;
                case 9:
                    mois="September";
                    break;
                case 10:
                    mois="October";
                    break;
                case 11:
                    mois="November";
                    break;
                case 12:
                    mois="December";
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
        
        System.out.println("The date is: "+day+Nday+" "+" "+mois+year);
        
        }
    public static void main(String[] args){
        input();
        Scanner let=new Scanner(System.in);
        System.out.println("Enter the format of your choice: \n"+"1. Default\n"+"2. Format1\n"+"3. Format2");
        int choice=let.nextInt();
        if(choice==1){
            print();
        }
        else if(choice==2){
            printformat1();
        }
        else if(choice==3){
            printformat2();
        }
        else{
            System.out.println("Invalid input!");
            System.out.println("ENter again!");
        }

    }
}
