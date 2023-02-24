package HomeWorkClass28;

import java.util.LinkedList;

public class Cards {
    //Create a Card class that will have interest rate field and card type
    //  and a constructor that will initialize the fields.
    //  Create 3 objects of different card and store them into LinkedList.
    //  Using for loop/advanced for loop/ iterator access all methods of the class.
    double interestRate;
    String carType;

    public Cards(double interestRate, String carType) {
        this.interestRate = interestRate;
        this.carType = carType;
    }
}
class testing{
    public static void main(String[] args) {
        Carr car=new Carr(12.5,"auto");
        Carr car1=new Carr(18.98,"auto and manual");
        Carr car2=new Carr(16.5,"manual");
        LinkedList<Carr> carrs=new LinkedList<>();
        carrs.add(car);
        carrs.add(car1);
        carrs.add(car2);
        for (int i = 0; i < carrs.size(); i++) {
            Carr c=carrs.get(i);

        }

    }
}