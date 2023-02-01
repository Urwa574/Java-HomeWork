package HomeWorkClass17;

public class Task1Tester {
    public static void main(String[] args) {
      Task1 House= new Task1("Mehar Palace","Contemporary","Beige",4000);
      House.printInfo();
        System.out.println("*2way*");
        Task1 house=new Task1();
        house.name="Mehar Palace";
        house.style="Contemporary";
        house.color="Beige";
        house.price=4000;
        house.printInfo();
    }
}
