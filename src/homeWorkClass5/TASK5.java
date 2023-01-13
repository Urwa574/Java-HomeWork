package homeWorkClass5;

import java.util.Scanner;

public class TASK5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Write a program to find largest of three double values using if-else..if and logical
        // operators provided by a user (numbers must be distinct)
        System.out.println("Please enter 3 NUMBERS");
        double number1=input.nextDouble();
        double number2= input.nextDouble();
        double number3= input.nextDouble();
        if(number1>number2&&number1>number3) {
            System.out.println("The largest number is " + number1);
        } else if (number2>number1&&number2>number3) {
            System.out.println("The largest number is " + number2);
        }else {
            System.out.println("The largest number is " + number3);
        }
input.close();

    }
}
