package lab5;

public class TestCustomer {
    public static void main(String[] args) {
        customer c1=new customer();
        System.out.println(c1);
        c1.setid(1);
        c1.setname("Mucyo");
        c1.setgender('M');

        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getgender());

    }
}
