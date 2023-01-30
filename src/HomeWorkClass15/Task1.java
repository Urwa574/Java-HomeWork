package HomeWorkClass15;

public class Task1 {
    /* 1) Create a method that will take 2 parameters as a numbers and prints which number is larger.
     */
    int number(int number1,int number2){
        if(number1>number2){
            return number1;
        }else{
            return number2;
        }
    }

    public static void main(String[] args) {
        Task1 no=new Task1();
        System.out.println(no.number(6,8));
    }
}
