package HomeWorkClass21;

public class CreditClass {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based
    on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */ // i did my task without constructor
    //with constructors task on java basic
    double balance;
    double interest;
    public void calculation() {
        double balance =100;
        double interest=12.5;
        System.out.println("the interest rate is "+(balance*interest)/100);
    }
}
class Visa extends CreditClass{

}
class AX extends CreditClass{
    @Override
  public void calculation() {
        double balance =100;
        double interest=8.5;
        System.out.println("the interest rate is "+(balance*interest)/100);

    }

    public static void main(String[] args) {
        CreditClass creditClass=new CreditClass();
        creditClass.calculation();
        Visa visa=new Visa();
        visa.calculation();
        AX ax=new AX();
        ax.calculation();
    }
}