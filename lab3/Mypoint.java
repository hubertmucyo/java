package lab3;

import java.util.Scanner;

public class Mypoint {
    
    int x;
    int y;

    Mypoint(){
        x=0;
        y=0;
    }

    Mypoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    void toString(Mypoint p){
        System.out.println("The point is: "+"("+p.x+","+p.y+")");
    }

    void distance(int nx,int ny){
        int dist1,dist2;
        dist1=x-nx;
        dist2=y-nx;
        System.out.println("The distance is: "+"("+dist1+","+dist2+")");
    }

    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("Enter point x and point y");
        int p1=get.nextInt();
        int p2=get.nextInt();

        Mypoint obj1=new Mypoint();
        System.out.println("The original point is:"+"("+obj1.x+","+obj1.y+")");

        Mypoint obj2=new Mypoint(p1,p2);
        obj1.toString(obj2);

        obj1.distance(p1, p2);

    }
}
