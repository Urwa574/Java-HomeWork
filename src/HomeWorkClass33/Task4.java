package HomeWorkClass33;

public class Task4 {
    //4) Create a method checkUserName that will throw a runtime exception.
    // Method should throw an exception when entered username is less than 5 characters.

    public static void checkUserName(String name){
        if(name.length()<5){
            throw new RuntimeException();
        }else {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        checkUserName("Urwa");
    }
}
