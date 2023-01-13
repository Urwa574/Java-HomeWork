package homeWorkClass5;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        /* 4)Write a program for user to enter his/hers birth month. Based on the month define the season.
         Example: if user is born in June, July or August → season =” Summer”.
         At the end of the program we should see output as “You were born
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month= input.next();
        switch (month){
            case "january":
            case "February":
                case "December":
                System.out.println(" You are born in Winter");
                break;
            case "March":
            case "April":
                case "May" :
                System.out.println("You are born in Spring");
                break;
            case "June" :
                   case "July":
                  case  "August" :
                System.out.println("You are born in Summer");
                break;
            case "September" :
            case "October":
                case "November" :
                System.out.println("You are born in Autumn");
                break;
            default:
                System.out.println("Invalid month");
                }
        }
    }

