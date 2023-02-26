package HomeWorkClass28;

import java.util.ArrayList;

public class Task2ALforCar {
    public static void main(String[] args) {
        //2)Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("AUDI");
        cars.add("MERCIDIES");
        System.out.println(cars);
        System.out.println("**********");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i));
        }
        System.out.println("**********"); //shortcut iter and it will print enhance loop for us
        for (String c:cars){
            System.out.println(cars);
        }

    }
}
