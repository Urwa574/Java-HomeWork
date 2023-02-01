package HomeWorkClass17;

public class Task3Tester {
    public static void main(String[] args) {
        Task3 taskPub=new Task3("Urwa",2023);
        Task3 taskDef=new Task3('F'); //same package and have access in other classes
        Task3 taskpro=new Task3(98.5); // pro hv access within its own package
    }
}
