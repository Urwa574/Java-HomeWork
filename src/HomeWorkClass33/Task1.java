package HomeWorkClass33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    //1) How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.
    //
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            System.out.println("enter your pin");
            int pin=input.nextInt();
        }catch (InputMismatchException IME){
            System.out.println("input invalid");
        }

    }
}
