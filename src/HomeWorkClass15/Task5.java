package HomeWorkClass15;

public class Task5 {
    //5) Write a method to return whether given number is prime or not?
    boolean isPrime(int a) {
            boolean flag = true;
            if (a > 1) {
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = false;
            }
            return flag;
        }

    public static void main(String[] args) {
        Task5 isprime=new Task5();
        System.out.println(isprime.isPrime(7));
    }
}

