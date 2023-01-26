package HomeWorkClass12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* 3) Write a program that reads two people's first
        names and if they're expecting boy or girl?
        Based on the input suggests a name for a baby:
      Example Output:
      Mom’s first name? Mary
      Dad’s first name? Daniel
      Boy or Girl? boy
      Suggested baby name: DANRY

          Example Output:
      Mom’s first name? Mary
       Dad’s first name? Daniel
        Boy or Girl? girl
      Suggested baby name: MAIEL
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Mother's First name");
        String mom= input.next();
        System.out.println("Father's First name");
        String dad= input.next();
        System.out.println("Boy or Girl?");
        String gender=input.next();
        String sugesstedname="";
        if(gender.equalsIgnoreCase("Girl")){
            sugesstedname= mom.substring(0,2).toUpperCase()+dad.substring(3,6).toUpperCase(); //also can done like this
            //dad.substring(0,dadsname.length()/2); to know the half
            System.out.println("Suggested name is "+sugesstedname);
        } else if (gender.equalsIgnoreCase("Boy")) {
            sugesstedname=dad.substring(0,3).toUpperCase()+mom.substring(2,4).toUpperCase();
            System.out.println("Suggested name is "+sugesstedname);
        }

    }
}
