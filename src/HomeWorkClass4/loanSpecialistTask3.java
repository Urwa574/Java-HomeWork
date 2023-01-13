package HomeWorkClass4;

import java.util.Scanner;
public class loanSpecialistTask3 {
    public static void main(String[] args) {
       /*You are a loan specialist & you need to ask user what is the amount of loan is needed.
        If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("What is the amount of loan you Need?");
        int amount= input.nextInt();
        if(amount<=200000){
            System.out.println("Congratulations we grant you a loan");
        }else{
            System.out.println("Sorry your loan is Rejected");
        }



    }
}
