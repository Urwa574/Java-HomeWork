package Project2;

public interface Shape {
    //1. Create an Interface 'Shape' with undefined
    //methods as calculateArea and
    //calculatePerimiter. Create 2 classes Circle &
    //Square that implements functionality defined in
    //the Shape Interface. Test your code.
public void calculateArea();
public void calculatePerimiter();
}
class Circle implements Shape{
 double pi=3.142;
 int radius=5;
 double area =pi*radius*radius;
 double perimeter=2*pi*radius;
    @Override
    public void calculateArea() {
        System.out.println("Area of circle is : "+area);
    }
    @Override
    public void calculatePerimiter() {
        System.out.println("perimeter of circle is: "+perimeter);
    }
}
class Square implements Shape{
    double side=4;
    double area=side*side;
    double per=4*side;

    @Override
    public void calculateArea() {
        System.out.println("Area of square is: "+area);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("perimeter of square is: "+per);
    }
}
