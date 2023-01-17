package HomeWorkClass8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* 4) Write a program to ask a user to enter item they want to buy and the price of that item.
         Every time user enters money accumulate the amount and tell the user how much is left to pay off.
         If user give more money program should return a change. Whenever a user done with
         payments program should say "Thank you for shopping!"
         */
//        System.out.println("Please enter the item you want to buy");
//        String item= input.next();
//        System.out.println("Please enter the price of this item");
//        int money= input.nextInt();
//        System.out.println("How much money you want to pay?");
//        int paidMoney= input.nextInt();
//        if(money>paidMoney){
//            System.out.println("you need to pay off "+(money-paidMoney)+" RS");
//        } else if (paidMoney>money) {
//            System.out.println("your change is "+(paidMoney-money)+" Rs");
//        }
//        System.out.println("Thank You for Shopping");
          double totalPrice=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the item you want to buy and its Price");
            String itemName = input.next();
            double itemPrice = input.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the total amount you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the item");
        double amountPaid=input.nextDouble();
        if(amountPaid>totalPrice){
            System.out.println("your change "+(amountPaid-totalPrice)+" RS");
        } else if (totalPrice>amountPaid) {
            System.out.println("pay "+(totalPrice-amountPaid)+" RS");
        }
        System.out.println("thank you for shopping");


    }
}