package HomeWorkClass19;

public class ShapeClass {
       /*
    1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code
     */
    double radius;
    ShapeClass(double radius){
        this.radius=radius;
    }
}
class Circle extends ShapeClass{
    double pi=3.14;
    double area;
    Circle(double radius){
        super(radius);
       area=radius*radius*pi;
    }
   void calculation(){
        System.out.println("the area of circle is "+area);
    }

    public static void main(String[] args) {
        Circle method=new Circle(10.6);
        method.calculation();
    }
}