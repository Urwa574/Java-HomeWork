package Project2D1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //7)Write a java program to check whether a given number is prime or not?
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number to check if it is prime or not");
        int number=sc.nextInt();
        int count=0;
        for (int i = 1; i <=number; i++) {
          if (number%i==0){
              count++;
          }
        }
        if (count==2){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }

     //2nd way easier
        int given=10;
        boolean isPrime=true;

        if(given>1) {
            for(int i=2; i<given; i++){

                if(given%i==0){
                    isPrime=false;
                    break;
                }
            }
        } else {
            isPrime=false;
        }

        System.out.println("Given number "+given+" is Prime? "+isPrime);












       }}