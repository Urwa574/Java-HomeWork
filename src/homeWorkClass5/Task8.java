package homeWorkClass5;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        /* 8)Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
         Based on operator provide the result to user.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter Two numbers ");
        int no1= input.nextInt();
        int no2= input.nextInt();
        System.out.println("Please enter Operator");
        char operator=input.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(no1 + no2);
                break;
            case '-':
                System.out.println(no1 - no2);
                break;
            case '*':
                System.out.println(no1 * no2);
                break;
            case '/':
                System.out.println(no1 / no2);
            default:
                System.out.println("invalid");
        }



    }
}
