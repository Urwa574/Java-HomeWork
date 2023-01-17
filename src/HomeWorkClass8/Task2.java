package HomeWorkClass8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    /* 2) Create a program that will be asking user to apply for a credit card 10 times.
     As soon you get an “yes” from a user program should stop asking.
      */
        Scanner input=new Scanner(System.in); //for loop use here because we know how many time we print this statement
     for(int i =0; i<=10; i++){
         System.out.println("Do you want a credit card");
         String userResponse=input.next();
         if(userResponse.equalsIgnoreCase("yes")){
             break;
         }
     }







        System.out.println("Please apply for a credit card");

    }
}
