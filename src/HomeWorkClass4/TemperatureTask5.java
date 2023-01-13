package HomeWorkClass4;

import java.util.Scanner;

public class TemperatureTask5 {
    public static void main(String[] args) {
        /*Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into Celsius and print
        “The temperature is the city  is ”
         */
        Scanner input=new Scanner(System.in);
        System.out.println("What is you city name?");
        String name=input.nextLine();
        System.out.println("What's the temperature there in Fahrenheit?");
        int temperature= input.nextInt();
        System.out.println("The temperature in your city is 10 Celsius");
// just a try code
        long min=3456789;
        long minuts= 60*24;
        long b=minuts*365;
        long year=min/b;
        long days=(min%b)/1440;
        System.out.println(min +"mins is approximately  " +year+ " years and days "+days);






    }
}
