package HomeWorkClass13;

public class Task3 {
    public static void main(String[] args) {
     //3) You have a String a=”Is it saturday? Is it raining?
     // Do we have a Java Class today?” How would you find out how many sentences are in that String?
        String str="Is it saturday? Is it raining? Do we have Java class today?";
        String [] strArr=str.split("[.?/]");
        System.out.println(strArr.length);
        //System.out.println(strArr.split("[?]").length); best way to write concisely
        System.out.println(strArr[0]);
        System.out.println(strArr[1].trim());
        System.out.println(strArr[2].trim());

    }
}
