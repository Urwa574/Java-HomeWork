package Project2;

public  class Car {
     /*Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own
implementation of calculateSalePrice() method in which returned price is calculated as
following: if weight>2000 then returned price car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also  does it is own implementation of
calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5%
discount, otherwise 10% discount
     */
  double carPrice;
    String color;

   void calculateSalePrice(){

     double price;
carPrice=80000;
     price=carPrice*0.675; 
       System.out.println(price);
   }
}
class Sedan extends Car{
    int length;
    Sedan(double carPrice,int length) {
        super.carPrice=carPrice;
        this.length = length;
    }
    @Override
   public void calculateSalePrice() {
            if(length<20){
             carPrice=carPrice-(carPrice*0.5);
            }else{
                carPrice=carPrice-(carPrice*0.1);
            }
        System.out.println(carPrice);
        }

        }
class Truck extends Car{
    //The Truck class has a field as weight and has its own
    //implementation of calculateSalePrice() method in which returned price is calculated as
    //following: if weight>2000 then returned price car should include 10% discount, otherwise 20%
    //discount.
    double weight;

    Truck(double carPrice,double weight) {
        super.carPrice=carPrice;
this.weight=weight;
    }
    @Override
   public void calculateSalePrice() {
        if (weight > 2000) {
            carPrice=carPrice-(carPrice*0.2);
        } else {
            carPrice=carPrice-(carPrice*0.25);
        }
        System.out.println(carPrice);
    }
}