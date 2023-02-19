package Project2;

public class TestCar {
    public static void main(String[] args) {
Car []car={new Car(),new Sedan(18000.98,18),new Truck(18799.0,15000)};
     for (Car c:car) {
         c.calculateSalePrice();
     }

    }
}
