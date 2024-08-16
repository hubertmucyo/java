package lab4;
import java.util.Scanner;
public class Name {
    String firstname;
    String middlename;
    String lastname;

    Name(){
        firstname=null;
        middlename=null;
        lastname=null;
    }

    void input(){
        Scanner get=new Scanner(System.in);
        System.out.println("Enter the firstname,middle name, and lastname: ");
        firstname=get.nextLine();
        middlename=get.next();
        lastname=get.next();
    }

    Name(String fName,String mName,String lName){
        firstname=fName;
        middlename=mName;
        lastname=lName;
    }

    Name(Name nama){
        input();
    }

    @Override
    public String toString(){
        return "The name is: "+firstname+" "+middlename+" "+lastname;
    }

    public static void main(String[] args) {
        Name n=new Name();
        Name n1=new Name(n);
        System.out.println(n1.toString());
    }

}
