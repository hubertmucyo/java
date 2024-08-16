package lab2;
import java.util.Scanner;
public class Stock{

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(){
        Scanner get=new Scanner(System.in);
        System.out.println("Enter stock symbol and name: ");
        symbol=get.nextLine();
        name=get.nextLine();
    }

    void getprice(){
        Scanner let=new Scanner(System.in);
        System.out.println("Enter the current Price:");
        currentPrice=let.nextDouble();

        System.out.println("Enter the previous price:");
        previousClosingPrice=let.nextDouble();

    }

    double  getChangePercent(){
        getprice();
        double perc;//percentage
        perc=(currentPrice-previousClosingPrice)*100/previousClosingPrice;
        return perc;
    }
    public static void main(String[] args) {
        Stock st1=new Stock();
        System.out.println("The percentage change is: "+st1.getChangePercent()+"%");
    }
}