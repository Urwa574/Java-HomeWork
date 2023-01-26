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
        System.out.print(reverse); //best approach


        // another way
        String str="sunday";
        for(int i=5; i>=0;i--){
            System.out.print(str.charAt(i));
        } //another way
        str="Sunday";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
