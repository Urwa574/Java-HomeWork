package HomeWorkClass7;

public class Task3 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        for(int even=20;even>=1;even-=2){
            System.out.println(even);
        }
        System.out.println("***********************");
        for (int no=20;no>=1;no-=2){
            if(no%2==0){
                System.out.println(no);
            }
        }




    }
}
