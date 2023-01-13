package homeWorkClass5;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
       /*7) Ask user to enter their country and capture it.
       Once values are captured print which language user speaks.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your Country Name");
        String name= input.next();
        switch (name){
            case "Usa":
                System.out.println("English");
                break;
            case "Pakistan":
                System.out.println("Urdu");
                        break;
            case "Spain":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("invalid");


        }


    }
}
