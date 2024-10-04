package lab6;

public class TestShape {
    public static void main(String [] args){
        Shape shape1=new Shape();
        System.out.println(shape1);

        Shape shape2=new Shape("Blue", false);
        System.out.println(shape2);

        shape1.setcolor();
        shape1.setfilled();
        System.out.println(shape1);
    }
}
