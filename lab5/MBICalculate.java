package lab5;

public class MBICalculate {

    static float bmi;

    static float bmicalc(int age,float weight,float height){
        bmi=weight/(height*height)*10000;
        return bmi; 
    }

    static void getyourstatus(){
        if (bmi<16){
            System.out.println("Severely underweight!");
        }
        else if(bmi>16 && bmi<18.4){
            System.out.println("Underweight!");
        }
        else if(bmi>18.5 &&bmi<24.9){
            System.out.println("normal!");
        }
        else if(bmi>25 &&bmi<29.9){
            System.out.println("Overeweight!");
        }
        else if(bmi>30){
            System.out.println("obese!");
        }
        else{
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Person p1=new Person(0, 0, 0);
        p1.setage();
        p1.setweight();
        p1.setheight();

        System.out.println("The entered values are: ");
        System.out.println("Age: "+p1.getage()+" weight: "+p1.getweight()+" height: "+p1.getheight());

        System.out.println("The BMI is:"+bmicalc(p1.getage(),p1.getweight(),p1.getheight()));
        System.out.println("you are: ");
        getyourstatus();

    }
    
}
