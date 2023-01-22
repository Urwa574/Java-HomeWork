package Project2D1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //2)Using Scanner create an array of countries.
        // When an array is created, retrieve all values from it and while retrieving those values print capital for each country.
        // (use 2 different loops).

         String [] countries={"Pakistan","America","Germany","Russia"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("the capital of "+countries[i]);
            String capital=sc.nextLine();
            System.out.println("the capital of "+countries[i]+" is "+capital);
        }
        System.out.println();
        System.out.println("***************");
       //
       int i=0;
       String [] arr=new String[4];
       arr[0] ="Pakistan";
       arr[1]="America";
       arr[2]="Germany";
       arr[3]="Russia";
       while (i<arr.length){
           if(arr[i].equals("Pakistan")){
               System.out.println("the capital is Islamabad");
           } else if (arr[i].equals("America")) {
               System.out.println("the capital is Washington Dc");
           } else if (arr[i].equals("Germany")) {
               System.out.println("the capital is Berlin");
           }else if (arr[i].equals("Russia")) {
               System.out.println("the capital is Moscow");
           }
           i++;
       }




    }
}
