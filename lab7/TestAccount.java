package lab7;

public class TestAccount {
public static void main(String[] args) {
    Customer cust2=new Customer();
    Account acc1=new Account(2405855,cust2,50000);
    System.out.println(acc1);
    acc1.setbalance();
    acc1.deposit();
    acc1.withdraw();
    System.out.println(acc1);
}
}
