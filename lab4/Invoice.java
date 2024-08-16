package lab4;

import java.util.Scanner;

public class Invoice {
    String pnumber;
    String pdesrc;
    int quantity;
    double price;

    Invoice(){
        pnumber=null;
        pdesrc=null;
        quantity=0;
        price=0.0;
    }

    Invoice(String pnumber){
        this.pnumber=pnumber;
        pdesrc=null;
        quantity=0;
        price=0.0;
    }

    Invoice(String pnumber, String pdesrc){
        this.pnumber=pnumber;
        this.pdesrc=pdesrc;
        quantity=0;
        price=0.0;
    }

    Invoice(String pnumber, String pdesrc, int quantity, double price){
        this.pnumber=pnumber;
        this.pdesrc=pdesrc;
        this.quantity=quantity;
        this.price=price;
    }

    Invoice(Invoice invoice2){
        this.pnumber=invoice2.pnumber;
        this.pdesrc=invoice2.pdesrc;
        this.quantity=invoice2.quantity;
        this.price=invoice2.price;
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Invoice i1=new Invoice();
    System.out.println("The part number, desrciption, quantity, and price is: "+i1.pnumber+" "+i1.pdesrc+" "+i1.quantity+" "+i1.price);

    System.out.println("ENter part number:");
    String pn0=sc.nextLine();
    Invoice i2=new Invoice(pn0);
    System.out.println("The part number, desrciption, quantity, and price is: "+i2.pnumber+" "+i2.pdesrc+" "+i2.quantity+" "+i2.price);

    System.out.println("ENter part description");
    String desc=sc.next();
    Invoice i3=new Invoice(pn0, desc);
    System.out.println("The part number, desrciption, quantity, and price is: "+i3.pnumber+" "+i3.pdesrc+" "+i3.quantity+" "+i3.price);

    System.out.println("ENter the quantity");
    int qty=sc.nextInt();
    System.out.println("Enter the price");
    Double pr=sc.nextDouble();
    Invoice i4=new Invoice(pn0, desc, qty, pr);
    System.out.println("The part number, desrciption, quantity, and price is: "+i4.pnumber+" "+i4.pdesrc+" "+i4.quantity+" "+i4.price);

    Invoice i5=new Invoice(i4);
    System.out.println("Final is:"+i5.pnumber+" "+i5.pdesrc+" "+i5.quantity+" "+i5.price);
    }
}
