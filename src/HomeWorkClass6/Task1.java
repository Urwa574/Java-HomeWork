package HomeWorkClass6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
/* 1. Create a boolean variable workDay and assign true create int variable day
and assign it to 1 As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off anymore”
 */
        boolean workDay=true;
 int day=1;
 while(workDay) {
     if(day<6){
     System.out.println("i need a day off");
     }else {
         workDay=false;
         System.out.println("i do not need a day off anymore");
     }
     day++;
     }
 //for(int Day=1;Day<6;Day++){
  //   System.out.println("i need a day off");
// }
 }
    }

