package lab9;

public class Departments {
    String display(){
        return ("There are three departments");
    }

}

class ComputerScience extends Departments{
    @Override
    String display(){
        return ("Teaching Computer Science");
    }
} 

class ComputerEngineering extends Departments{
    @Override
    String display(){
        return ("Teaching Computer Engineering");
    }
}

class TeachingModules{
    public static void main(String[] args) {
        ComputerScience cs=new  ComputerScience();
        ComputerEngineering ce=new ComputerEngineering();
        System.out.println(cs.display()+ " "+ce.display());
        System.out.println(cs.display()+ " "+ce.display());
    }
}