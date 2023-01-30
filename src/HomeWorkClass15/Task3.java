package HomeWorkClass15;

public class Task3 {
    //3) Create a method that will print whether given String is palindrome or not.
    // when we are only printing things we use  return type=> void method
    // name=> ispalindrome , parameters=> String inputStr {
    // }
    //example dad=> dad true
    // abc=> cba false
    void revstr(String st) {
        StringBuilder str = new StringBuilder(st);
        if (str.reverse().toString().equals(st)) {
            System.out.println(st + " is a palindrome");
        } else {
            System.out.println(st + " is NOt a palindrome");
        }
    }


    public static void main(String[] args) {
//        String str="dad";
//        StringBuilder st=new StringBuilder(str);
//        st.reverse();
//        String reverseStr=st.toString();
//        if (str.equals(reverseStr)){
//            System.out.println(str+ " is palindrome");
//        }else{
//            System.out.println(str+ "is not palindrome"); its a logic
//        }
        Task3 task3=new Task3();
        task3.revstr("kaya"); //just take input not returning just returning the method logic if its palindrome
        // we cant assign void methods to variables
        //System.out.println(); cant use void methods in println, we cant not print it or assign it in void
    }

}
