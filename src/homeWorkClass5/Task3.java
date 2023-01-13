package homeWorkClass5;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        /* 3) Write a program that will read three inputs of scores
        (quiz, midterm, and final scores) and determine the grade based on the following rules:
         if the average score >=90 → grade=A if the average score >= 70 and <90 → grade=B
         if the average score>=50 and <70 → grade=C if the average score<50 → grade=F
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your Scores");
        int score= scan.nextInt();
        if(score>=90){
            System.out.println("Grade A");
        } else if (score>=70 && score<90) {
            System.out.println("Grade B");
        } else if (score>=50 && score <=70) {
            System.out.println("Grade C");
        } else if (score<50) {
            System.out.println("Grade F");
        }
    }
}
