package lab7;

import java.util.Scanner;
public class Account {
    private int acc_No;
    private Customer Customer;
    private double balance=0.0;

Scanner getter=new Scanner(System.in);

Account(int id, Customer Customer,double balance){
    acc_No=id;
    this.Customer=Customer;
    this.balance=balance;
}

Account(int id,Customer Customer){
    acc_No=id;
    this.Customer= Customer;
}

void setbalance(){
    System.out.println("Enter your account balance:");
    balance=getter.nextDouble();
}

double deposit(){
    System.out.println("Enter amount you want to deposit:");
    double deposit=getter.nextDouble();
    balance+=deposit;
    return balance;
}

void withdraw(){
    System.out.println("Enter amount to withdraw:");
    double amount=getter.nextDouble();
    if (balance >= amount)
    balance = balance - amount;
    else
    System.out.println("Withdraw amount exceeded account balance.");
}

@Override
public String toString(){
    String outer=String.format("%s (%s) %s",Customer.getname(),Customer.getid(),balance);
    return outer;
}
}
