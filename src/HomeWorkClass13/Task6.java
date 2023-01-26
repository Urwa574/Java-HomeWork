package HomeWorkClass13;

public class Task6 {
    public static void main(String[] args) {
        //6) How would you swap  2 strings without a temporary variable?
      String a="Hello";
      String b="World";
        System.out.println("String before swap a: "+a+"  and b: "+b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("string after swap a: "+a+" and b: "+b);

    }
}
