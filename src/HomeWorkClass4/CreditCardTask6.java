package HomeWorkClass4;

import java.util.Scanner;
public class CreditCardTask6 {
    public static void main(String[] args) {
       /*Create a Java program that will ask if user has a credit card or not.
       If you user does not have a credit card then offer them. If they do have
       one ask what is balance on the card? If balance of the card is larger than 1000,
       tell them to pay off immediately, otherwise you can tell them that they can spend more.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a Credit Card?");

        String CreditCard=input.nextLine(); //nextLine is used when we have to take sentences from the keyboard
        if(CreditCard.equals("yes")) {
            System.out.println("What is the balance in your card?");
            if (CreditCard.equals("no")) {
                System.out.println("Do you want to apply for Card");
            }
            int balance = input.nextInt();
            if (balance > 1000) {
                System.out.println("Please pay off your bill immediately");
            } else {
                System.out.println("You can spend more.");
            }
        }
    }
}
