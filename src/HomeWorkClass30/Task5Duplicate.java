package HomeWorkClass30;

import java.util.ArrayList;
import java.util.List;

public class Task5Duplicate {
    public static void main(String[] args) {
       // 5)Create a collection of integers in which you can keep duplicates.
        //Write a logic to find sum of all integers
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1500);
        list.add(52);
        list.add(5);
        list.add(5000);
        int sum=0;
        for (int number:list){
           sum+=number;
        }
        System.out.println(sum);

    }
}
