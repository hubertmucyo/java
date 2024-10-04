package lab5;

import java.util.Scanner;

public class Students {

    private int sid;
    private String sname;
    private char sgender;
    private String ssubjectName;
    private float smarks;

    Scanner sc=new Scanner(System.in);
    
    Students(int sid,String sname,char sgender, String ssubjectName,float smarks){
        this.sid=sid;
        this.sname=sname;
        this.sgender=sgender;
        this.ssubjectName=ssubjectName;
        this.smarks=smarks;
    }

    //getters 

    public int getsid(){
        return sid;
    }
    public String getsname(){
        return sname;
    }
    public char getsgender(){
        return sgender;
    }
    public String getssubjectname(){
        return ssubjectName;
    }
    public float getsmarks(){
        return smarks;
    }

    //setters

    public void setsid(){
        System.out.println("Enter ID:");
        int newid=sc.nextInt();
        sid=newid;
    }
    public void setsgender(){
        System.out.println("enter gender:");
        char newsgender=sc.next().charAt(0);
        sgender=newsgender;
    }
    public void setsname(){
        System.out.println("Enter name: ");
        String newsname=sc.next();
        sname=newsname;
    }
    public void setsubjectname(){
        System.out.println("Enter Subject Name");
        String subject=sc.next();
        ssubjectName=subject;
    }
    public void setmarks(){
        System.out.println("ENter marks");
        float marks=sc.nextFloat();
        smarks=marks;
         
        if(marks<0 ||marks>100){
            System.out.println("The marks input is out of boundaries {between 0 and 100}");
            System.out.println("enter valid marks");
            marks=sc.nextFloat();
            smarks=marks;
        }
    }

    public String toString(){
        return "ID: "+sid+", Name: "+sname+", Gender: "+sgender+", Subject: "+ssubjectName+", and Marks: "+smarks;
    }
}

