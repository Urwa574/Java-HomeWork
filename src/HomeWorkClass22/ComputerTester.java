package HomeWorkClass22;

public class ComputerTester {
    public static void main(String[] args) {


        Computer[] computers = {new Apple(), new Dell(), new Lenovo(), new HP()};
        for (Computer c : computers){
            c.features();
            c.price();
        }
    }
}