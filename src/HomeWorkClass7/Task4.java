package HomeWorkClass7;

public class Task4 {
    public static void main(String[] args) {
        //4. Print odd numbers between 20 and 50 (2 ways)
        for (int i=21;i<=50;i+=2){
            System.out.println(i);
        }
        System.out.println("***************");
        for (int no=20;no<=50;no++){
            if(no%2!=0){
                System.out.println(no);
            }
        }
        }

    }

