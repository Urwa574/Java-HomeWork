package HomeWorkClass16;

public class Task3 {
    /* 3) Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
     Method should be available inside the class only where it was declared and executed by calling it is name.

     */

  private String vowels(String vow){
      System.out.println(vow.replaceAll("[^aeiou]","")); //here we trying to remove from input all letters other than vowels thats y we use replaceAll method
      return vow; //^ is use to write not called carot
  }
    public static void main(String[] args) {
        Task3 task=new Task3();
        System.out.println(task.vowels("hello"));
        // we can also use static method with private and in main method we can directly call by method name which is vowels("hello");
    }
}
