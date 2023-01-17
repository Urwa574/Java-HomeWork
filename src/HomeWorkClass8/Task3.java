package HomeWorkClass8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* 3) Write a program that reads a range of integers (start and end point), provided by a user and
        then from that range prints the sum of the even and odd integers.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter two Numbers starting point and ending point");
       int start=input.nextInt();
       int end=input.nextInt();
        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <=end ; i++) {
            if(i%2==0){
                evenSum+=i; // can also be written like this
            }else {
                oddSum=oddSum+i; // can also be written like this oddSum+=i
            }
        }
        System.out.println("Sum of all the Even Numbers "+evenSum);
        System.out.println("Sum of all the Odd Numbers "+oddSum);

        }


    }

