package HomeWorkClass28;

import java.io.Serializable;
import java.util.ArrayList;

public class Task4ALReplace {
    public static void main(String[] args) {
        //4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList<String>drinks=new ArrayList<>();
       drinks.add("sprite");
        drinks.add("cola");
        drinks.add("lemonade");
        drinks.add("pepsi");

        for (int i = 0; i < drinks.size(); i++) {
           String drink= drinks.get(i);
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
        //drinks.replaceAll(d->d.contains("a")||d.contains("e")?"water":d); iterator
        //  System.out.println(drinks);
    }
}
