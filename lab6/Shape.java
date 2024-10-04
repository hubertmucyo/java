package lab6;
import java.util.Scanner;
public class Shape {
    String color;
    boolean filled;
    
    Shape(){
        color="Green";
        filled=true;
    }

    Shape(String col,boolean fill){
        color=col;
        filled=fill;
    }

    //getters

    String getcolor(){
        return color;
    }

    boolean getfilled(){
        return filled;
    }

    //setters

    void setcolor(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the color you want: ");
        color=sc.nextLine();
    }

    void setfilled(){
        if (color == null) {
            filled=false;
        }
        else{
            filled=true;
        }
    }
    @Override
    public String toString(){
        String word;
        if (filled){
            word="filled";
        }
        else{
            word="not filled";
        }
        String result=String.format("A Shape with color of %s and %s ",color, word);
        return result;
    }
}
