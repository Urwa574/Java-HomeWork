package HomeWorkClass28;

public class Task6 {
    /*6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
     Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
     */
}
abstract class Insurance {
    String insuranceName;
   abstract void getQuote();
    abstract void cancelInsurance();
}
class car extends Insurance{
    String carModel="bmw";
    @Override
    void getQuote() {
        System.out.println("bmw the great");
    }

    @Override
    void cancelInsurance() {
        System.out.println("insurance of car is for 2 years");
    }
}
class pet extends Insurance{
   String petType="cat";
    @Override
    void getQuote() {
        System.out.println("meow");
    }

    @Override
    void cancelInsurance() {
        System.out.println("insurance of cat");
    }
}
class Health extends Insurance{
    @Override
    void getQuote() {
        System.out.println("nkj");
    }
    @Override
    void cancelInsurance() {
        System.out.println("you should have health insurance");
    }
}