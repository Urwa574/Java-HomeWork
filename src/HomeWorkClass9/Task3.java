package HomeWorkClass9;

public class Task3 {
    public static void main(String[] args) {
        //1.	 3) Create an array of words: Java, Saturday, day, coding, is.
        // Print the following sentence using elements of array: “Saturday is Java coding Day”.
        String [] words={"java","Saturday","day","coding","is"};
        words [0]="Saturday";
        words [1]="is";
        words [2]="java";
        words [3]="coding";
        words [4]="day";
        for (int i = 0; i <=4 ; i++) {
            System.out.print(words[i]+" ");

        }


    }
}
