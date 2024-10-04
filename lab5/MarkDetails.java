package lab5;

public class MarkDetails {
    public static void main(String[] args) {
        
        Students s1=new Students(6897, "Hubert", 'M', "Computer Science", 89);
        System.out.println(s1);
        s1.setsid();
        s1.setsname();
        s1.setsgender();
        s1.setsubjectname();
        s1.setmarks();
        System.out.println("The values inputed are: ");
        System.out.println("ID: "+s1.getsid());
        System.out.println("Name: "+s1.getsname());
        System.out.println("Gender: "+s1.getsgender());
        System.out.println("Subject "+s1.getssubjectname());
        System.out.println("Marks obtained: "+s1.getsmarks());



    }
}
