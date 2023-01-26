package HomeWorkClass13;

public class Task5 {
    public static void main(String[] args) {
    /*5) How would you check if String is palindrome or not? aba=> true
      Abbc =>false
  */
        String a="hello";

         StringBuilder str=new StringBuilder(a);
        String reverse=str.reverse().toString();
        if(a.equals(reverse)){
            System.out.println("its a palindrome");
        }else {
            System.out.println("its not a palindrome");
        }

    }
}
