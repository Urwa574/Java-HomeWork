package HomeWorkClass28;

import java.util.ArrayList;

public class Task1ArrayList {
    public static void main(String[] args) {
        //1) Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that
        ArrayList<String> name=new ArrayList<>();
        name.add("Urwa");
        name.add("Rubeel");
        name.add("Laiba");
        name.add("Shari");
        name.add("Hashim");
        System.out.println(name.isEmpty());
        System.out.println(name.contains("Urwa"));
        System.out.println(name.size());
        System.out.println(name);

    }
}
