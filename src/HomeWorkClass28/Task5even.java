package HomeWorkClass28;

import java.util.ArrayList;

public class Task5even {
    public static void main(String[] args) {
        //5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
        ArrayList<Integer> even=new ArrayList<>();
        for (int i = 1; i < 500; i++) {
            if (i%2==0){
                even.add(i);
            }
         even.removeIf(s->s%5==0);
            System.out.println(even);
        }
    }
}
