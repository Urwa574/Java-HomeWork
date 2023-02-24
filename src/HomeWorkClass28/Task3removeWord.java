package HomeWorkClass28;

import java.util.ArrayList;

public class Task3removeWord {
    public static void main(String[] args) {
        //3)Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> words=new ArrayList<>();
        words.add("table");
        words.add("Chair");
        words.add("rose");
        words.add("flower");
        words.add("bed");
     words.removeIf(w->w.endsWith("e")); // using iterator here
        System.out.println(words);
    }
}
