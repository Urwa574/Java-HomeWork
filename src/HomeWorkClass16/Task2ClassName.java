package HomeWorkClass16;

public class Task2ClassName {
    /*
    2) Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
     */
    public String reverse(String input){
        StringBuilder reversed=new StringBuilder(input);
        String output=reversed.reverse().toString();
        return output;
        //ANother
        //public  static String reverseStr(string input) {
      //  return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Task2ClassName task=new Task2ClassName();
        System.out.println(task.reverse("sunday"));
        // if we are within the class we don't need the class name as well with keyword static
        //reverseStr("sunday"); static method can be called by just writing the name of the class method name
    }
}
