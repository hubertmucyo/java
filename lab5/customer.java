package lab5;
import java.util.*;

public class customer {

    private int id;
    private String name;
    private char gender;

    customer(){
        id=6897;
        name="Hubert";
        gender='M';
    }
    //Id getter and setter
    public int getid(){
        return id;
    }
    public void setid(int idt){
        id=idt;
    }

    //name getter and setter
    public String getname(){
        return name;
    }
    public void setname(String newname){
        name=newname;
    }

    //gender getter and setter
    public char getgender(){
        return gender;
    }
    public void setgender(char newgender){
        gender=newgender;
    }

    //toString method
    public String toString(){
        return id+" "+name+" "+gender+" ";
    }


    
}