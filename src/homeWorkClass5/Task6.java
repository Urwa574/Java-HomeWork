package homeWorkClass5;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        /*6)Write a program to find largest number among three numbers using nested if
        provided by a user (numbers must be distinct)
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 NUMBERS");
        int number1=input.nextInt();
        int number2= input.nextInt();
        int number3= input.nextInt();
        if(number1>number2){
            if(number1>number3){
            System.out.println("The largest number is " + number1);}}
         if (number2>number1) {
                if (number2 > number3) {
                    System.out.println("The largest number is " + number2);}}
                 if (number3>number1){
                    if(number3>number2) {
                        System.out.println("The largest number is " + number3);
                }}
                input.close();
            }}

