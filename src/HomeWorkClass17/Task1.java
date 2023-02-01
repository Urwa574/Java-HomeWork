package HomeWorkClass17;

public class Task1 {
    //1) Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.
     String name;
     String style;
     String color;
     int price;
  Task1(String Task1name,String Task1style,String Task1color,int Task1price){
      name=Task1name;
      style=Task1style;
      color=Task1color;
      price=Task1price;
  }
  Task1(){

  }
      void printInfo(){

      System.out.println("Name "+name+" color "+color+" style "+style+" price "+price);
      }
  }


