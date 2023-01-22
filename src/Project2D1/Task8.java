package Project2D1;

public class Task8 {
    public static void main(String[] args) {
        //8)Write a Java Program to print the first 10 numbers of Fibonacci series.
        int n1=0,n2=1,sum=0;
        for (int i = 0; i < 15; i++) {
            sum=n1+n2; //0+1=1+1
            System.out.print(sum+" "); //sum=1,2
            n1=n2;
            n2=sum;

        }
    }
}
