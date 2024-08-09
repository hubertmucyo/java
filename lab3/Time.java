package lab3;
import java.util.*;
public class Time {
    int hour,minute,second;

    Time(){
        hour=0;
        minute=0;
        second=0;
    }

    Time(int hour){
        this.hour=hour;
        minute=0;
        second=0;
    }

    Time(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
        second=0;
    }

    Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    Time(Time t){
        this.hour=t.hour;
        this.minute=t.minute;
        this.second=t.second;
    }

    public static void main(String [] args){
        Scanner get=new Scanner(System.in);

        Time obj1= new Time();
        System.out.println("The time is: "+obj1.hour+":"+obj1.minute+":"+obj1.second);

        System.out.println("ENter the hour: ");
        int hr=get.nextInt();
        Time obj2=new Time(hr);
        System.out.println("The Second Time is: "+obj2.hour+":"+obj2.minute+":"+obj2.second);

        System.out.println("ENter minutes: ");
        int min=get.nextInt();
        Time obj3=new Time(hr, min);
        System.out.println("The Third Time is: "+obj3.hour+":"+obj3.minute+":"+obj3.second);

        System.out.println("Enter seconds: ");
        int sec=get.nextInt();
        Time obj4=new Time(hr, min, sec);
        System.out.println("The fourth time is: "+obj4.hour+":"+obj4.minute+":"+obj4.second);

        Time obj5=new Time(obj4);
        System.out.println("The final Time is: "+obj5.hour+":"+obj5.minute+":"+obj5.second);

    }
}
