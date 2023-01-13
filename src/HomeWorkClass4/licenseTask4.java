package HomeWorkClass4;

import java.util.Scanner;
public class licenseTask4 {
    public static void main(String[] args) {
     /*You are DMV representative & you need to ask customer their age.
     If they are 18 and older you will issue a driver license to them,
     otherwise you will offer them to get a learners permit.
      */
        Scanner input=new Scanner(System.in);
        System.out.println("What is your age?");
        int age= input.nextInt();
        if(age>=18){
            System.out.println("Congratulations, we are about to issue you a license");
        }else{
            System.out.println("Please get a permit letter");
        }








    }
}
