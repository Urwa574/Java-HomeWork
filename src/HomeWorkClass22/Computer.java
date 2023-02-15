package HomeWorkClass22;

public class Computer {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.
 public void price(){
     System.out.println("every computer has different prices");
 }
 public void features(){
     System.out.println("every computer has different features");
 }
}
class Apple extends Computer{
public void camera(){
    System.out.println("amazing result");
}

    @Override
    public void price() {
        System.out.println("1500$");
    }

    @Override
    public void features() {
        System.out.println("new features");
    }
}
class Lenovo extends Computer{
    public void memory() {
        System.out.println("Lenovo computer have Awesome memory");}

    @Override
    public void price() {
        System.out.println("different price");
    }

    @Override
    public void features() {
        System.out.println("different features");
    }
}
class HP extends Computer{
    @Override
    public void price() {
        System.out.println("starts price from 35000");
    }

    @Override
    public void features() {
        System.out.println("amazing features");
    }
}
class Dell extends Computer{
    @Override
    public void price() {
        System.out.println("90000");
    }

    @Override
    public void features() {
        System.out.println("different features");
    }
}