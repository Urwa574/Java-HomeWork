package HomeWorkClass30;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        //4)Create the collection that will store single uniques Objects of a String type in which order is preserved.
        //Write a logic to concatenate all string from the collection.
        Set<String> obj=new LinkedHashSet<>();
        obj.add("urwa");
        obj.add("abeera");
        obj.add("asli");
        obj.add("diana");
        String concatinatedString=String.join(" , ",obj);
        System.out.println(concatinatedString);
    }
}
