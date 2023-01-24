package HomeWorkClass12;

public class Task2 {
    public static void main(String[] args) {
        //2) Create a String and print it in reverse order (Sunday → yadnuS).
      String name="Sunday";
      int length=name.length();
       String reverse="";
        for (int i =length-1; i >=0 ; i--) {
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
}
