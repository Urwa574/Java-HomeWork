package HomeWorkClass28;

import java.util.Iterator;
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
        Cards card=new Cards(12.5,"auto");
        Cards card1=new Cards(18.98,"auto and manual");
        Cards card2=new Cards(16.5,"manual");
        LinkedList<Cards> cards=new LinkedList<>();
        cards.add(card);
        cards.add(card1);
        cards.add(card2);
        for (int i = 0; i < cards.size(); i++) {
            Cards c=cards.get(i);
            System.out.println("cards interest rate is "+c.interestRate+" and type is "+c.carType);
        }
        System.out.println("*******2nd******");
  for (Cards cardd:cards){
      System.out.println("cards interest rate is "+cardd.interestRate+" and type is "+cardd.carType);
  }
        System.out.println("*******3rd******");
        Iterator<Cards> cardsI=cards.iterator();
        while (cardsI.hasNext()) {
            Cards ca = cardsI.next();
            System.out.println("cards interest rate is " + ca.interestRate + " and type is " + ca.carType);
        }
    }
}