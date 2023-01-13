package HomeWorkClass6;

public class Task4 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        int even=20;
        while(even>=1){
            if(even%2==0){
                System.out.println(even);
            } even--;
        }
        System.out.println("----------------------------");
        int num=20;
        while (num>=1){
            System.out.println(num);
        num-=2; //short hand
        }
    }
}
