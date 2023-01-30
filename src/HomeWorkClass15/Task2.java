package HomeWorkClass15;

public class Task2 {
//2) Create a method that will take a number and prints whether the number is even or odd.
    String no(int no){
        if(no%2==0){
            return "even";
        }else{
            return "odd";
        }
    }

    public static void main(String[] args) {
        Task2 EvenOdd=new Task2();
        System.out.println(EvenOdd.no(8));
    }
}
