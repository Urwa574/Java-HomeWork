package Project2D1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1)Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
        Scanner input=new Scanner(System.in);
        int sum=0;
        int [] number=new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i]=input.nextInt();
            sum=sum+number[i];
        }
        System.out.println(sum);
    }
}
