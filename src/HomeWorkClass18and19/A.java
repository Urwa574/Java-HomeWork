package HomeWorkClass18and19;

public class A {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    String hello;
    void printHello(){
        System.out.println("hello");
    }
}
class B extends A{
    String hi;
    void printHi(){
        System.out.println("hi im inheriting class A");
    }
}
class C extends B{
    void hiHello(){
        System.out.println("im inheriting class B ");
    }
}